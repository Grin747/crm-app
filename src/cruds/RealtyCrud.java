package cruds;

import entities.Card;
import entities.Realtor;
import entities.Realty;

import java.sql.*;
import java.util.ArrayList;

public class RealtyCrud extends Crud {

    public static void add(Realty realty) {
        String sql = "insert into realty " +
                "(in_price, mort_price, cash_price, realtor, delivery_date, street, res_complex," +
                "district, city, building, square, square_unit, room_count, floor, owner, " +
                "docs_type, obj_type, comment, own_type) " +
                "values (?, ?, ?," +
                " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, realty.getIn_price());
            statement.setInt(2, realty.getMort_price());
            statement.setInt(3, realty.getCash_price());
            statement.setInt(4, realty.getRealtor());
            statement.setDate(5, new Date(realty.getDelivery_date().getTime()));
            statement.setInt(6, realty.getStreet());
            statement.setInt(7, realty.getRes_complex());
            statement.setInt(8, realty.getDistrict());
            statement.setInt(9, realty.getCity());
            statement.setString(10, realty.getBuilding());
            statement.setFloat(11, realty.getSquare());
            statement.setInt(12, realty.getSquare_unit());
            statement.setInt(13, realty.getRoom_count());
            statement.setInt(14, realty.getFloor());
            statement.setInt(15, realty.getOwner());
            statement.setInt(16, realty.getDocs_type());
            statement.setInt(17, realty.getObj_type());
            statement.setString(18, realty.getComment());
            statement.setInt(19, realty.getOwn_type());

            statement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static ArrayList<Card> getCards() {
        ArrayList<Card> cards = new ArrayList<>();
        try (Statement statement = conn.createStatement()) {
            ResultSet rs = statement.executeQuery("select * from get_cards()");
            while (rs.next()) {
                cards.add(new Card(rs.getInt("id"), rs.getString("title"),
                        rs.getString("address"), rs.getString("price")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cards;
    }

    public static Realty get(int id) {
        String sql = "select * from realty where realty_id = ?";
        Realty realty = null;
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            realty = new Realty(
                    resultSet.getInt("realty_id"),
                    resultSet.getInt("in_price"),
                    resultSet.getInt("mort_price"),
                    resultSet.getInt("cash_price"),
                    resultSet.getInt("realtor"),
                    resultSet.getDate("delivery_date"),
                    resultSet.getInt("street"),
                    resultSet.getInt("res_complex"),
                    resultSet.getInt("district"),
                    resultSet.getInt("city"),
                    resultSet.getString("building"),
                    resultSet.getFloat("square"),
                    resultSet.getInt("square_unit"),
                    resultSet.getInt("room_count"),
                    resultSet.getInt("floor"),
                    resultSet.getInt("owner"),
                    resultSet.getInt("docs_type"),
                    resultSet.getInt("obj_type"),
                    resultSet.getString("comment")
            );

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return realty;
    }

    public static ArrayList<Realty> getByRealtor(int realtor_id) {
        String sql = "select * from realty where realtor = ?";
        ArrayList<Realty> realties = new ArrayList<>();
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, realtor_id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                realties.add(new Realty(
                        resultSet.getInt("realty_id"),
                        resultSet.getInt("in_price"),
                        resultSet.getInt("mort_price"),
                        resultSet.getInt("cash_price"),
                        resultSet.getInt("realtor"),
                        resultSet.getDate("delivery_date"),
                        resultSet.getInt("street"),
                        resultSet.getInt("res_complex"),
                        resultSet.getInt("district"),
                        resultSet.getInt("city"),
                        resultSet.getString("building"),
                        resultSet.getFloat("square"),
                        resultSet.getInt("square_unit"),
                        resultSet.getInt("room_count"),
                        resultSet.getInt("floor"),
                        resultSet.getInt("owner"),
                        resultSet.getInt("docs_type"),
                        resultSet.getInt("obj_type"),
                        resultSet.getString("comment")
                ));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return realties;
    }
}
