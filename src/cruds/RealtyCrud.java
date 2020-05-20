package cruds;

import entities.Realty;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class RealtyCrud extends Crud{
    public static ArrayList<Realty> select() {

        ArrayList<Realty> realties = new ArrayList<Realty>();
        try {
            Class.forName("org.postgresql.Driver");
            try (Connection conn = DriverManager.getConnection(url, info)) {

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM realty");
                while (resultSet.next()) {
                    Realty realty = new Realty();
                    realty.setId(resultSet.getInt("id"));
                    realty.square = resultSet.getFloat("square");
                    realty.setFloor(resultSet.getInt("floor"));
                    realty.room_count = resultSet.getInt("room_count");
                    realty.in_price = resultSet.getLong("in_price");
                    realty.cash_price = resultSet.getLong("cash_price");
                    realty.mort_price = resultSet.getLong("mort_price");
                    realty.commission = resultSet.getFloat("commission");
                    realty.delivery_date = resultSet.getDate("delivery_date");
                    realty.comment = resultSet.getString("comment");
                    realties.add(realty);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return realties;
    }

    public static int insert(Realty realty) {
        try {
            Class.forName("org.postgresql.Driver");
            try (Connection conn = DriverManager.getConnection(url, info)) {

                String sql = "INSERT INTO realty (floor) Values (?)";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setInt(1, realty.getFloor());

                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }
}
