package cruds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public abstract class Crud {
    static String url = "jdbc:postgresql://localhost:5432/crmdb";
    static Properties info = new Properties();
    static Connection conn;

    static {
        info.setProperty("user", "crm");
        info.setProperty("password", "");
        info.setProperty("useUnicode","true");
        info.setProperty("characterEncoding","UTF-8");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(url, info);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static int delete(int id, String table) {

        try {

            String sql = "DELETE FROM " + table + " WHERE id = ?";

            try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setInt(1, id);
                return preparedStatement.executeUpdate();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
