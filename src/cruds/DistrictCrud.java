package cruds;

import entities.District;

import java.sql.*;
import java.util.ArrayList;

public class DistrictCrud extends Crud{
    public static ArrayList<District> select() {

        ArrayList<District> districts = new ArrayList<District>();
        try {
            Class.forName("org.postgresql.Driver");
            try (Connection conn = DriverManager.getConnection(url, info)) {

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM district");
                while (resultSet.next()) {

                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    District district = new District(id, name);
                    districts.add(district);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return districts;
    }

    public static District selectOne(int id) {

        District district = null;
        try {
            Class.forName("org.postgresql.Driver");
            try (Connection conn = DriverManager.getConnection(url, info)) {

                String sql = "SELECT * FROM district WHERE id=?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setInt(1, id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()) {
                        int distId = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        district = new District(distId, name);
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return district;
    }

    public static int insert(District district) {

        try {
            Class.forName("org.postgresql.Driver");
            try (Connection conn = DriverManager.getConnection(url, info)) {

                String sql = "INSERT INTO district (name) Values (?)";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, district.getName());

                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public static int update(District product) {

        try {
            Class.forName("org.postgresql.Driver");
            try (Connection conn = DriverManager.getConnection(url, info)) {

                String sql = "UPDATE district SET name = ? WHERE id = ?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, product.getName());
                    preparedStatement.setInt(2, product.getId());

                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public static int delete(int id) {

        try {
            Class.forName("org.postgresql.Driver");
            try (Connection conn = DriverManager.getConnection(url, info)) {

                String sql = "DELETE FROM district WHERE id = ?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setInt(1, id);

                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }
}
