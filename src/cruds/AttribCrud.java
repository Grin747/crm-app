package cruds;

import entities.Attribute;

import java.sql.*;
import java.util.ArrayList;

public class AttribCrud extends Crud {

    public static ArrayList<Attribute> select(String table) {

        ArrayList<Attribute> attributes = new ArrayList<>();
        try(Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + table);

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Attribute attribute = new Attribute(id, name);
                attributes.add(attribute);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return attributes;
    }

    public static Attribute selectOne(int id, String table) {

        Attribute attribute = null;
        String sql = "SELECT * FROM " + table + " WHERE id=?";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int distId = resultSet.getInt("id");
                String name = resultSet.getString("name");
                attribute = new Attribute(distId, name);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return attribute;
    }

    public static int insert(String table, String name) {
        try {

            String sql = "INSERT INTO " + table + " (name) Values (?)";
            try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setString(1, name);
                return preparedStatement.executeUpdate();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public static int update(String table, Attribute attribute) {

        try {

            String sql = "UPDATE " + table + " SET name = ? WHERE id = ?";
            try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setString(1, attribute.getName());
                preparedStatement.setInt(2, attribute.getId());

                return preparedStatement.executeUpdate();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
