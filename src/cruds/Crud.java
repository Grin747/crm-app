package cruds;

import entities.RegReport;

import java.sql.*;
import java.util.ArrayList;
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

    public static ArrayList<RegReport> report(){
        ArrayList<RegReport> reports = new ArrayList<>();
        try(Statement statement = conn.createStatement()) {
            ResultSet rs = statement.executeQuery("select * from region_report()");
            while (rs.next()){
                reports.add(new RegReport(
                        rs.getString("complex"),
                        rs.getInt("active"),
                        rs.getInt("sold")
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return reports;
    }
}
