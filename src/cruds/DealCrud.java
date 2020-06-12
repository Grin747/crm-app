package cruds;

import entities.Deal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

public class DealCrud extends Crud {
    public static void add(Deal deal) {
        String sql = "insert into deal (client_id, realty_id, realtor_id, deal_date, profit) " +
                "values (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, deal.getClient());
            statement.setInt(2, deal.getRealty());
            statement.setInt(3, deal.getRealtor());
            statement.setDate(4, new Date(deal.getDeal_date().getTime()));
            statement.setInt(5, deal.getProfit());

            statement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static HashMap<Integer, String> getInfo(int realtor_id) {
        String sql = "select * from get_deals_info(?);";
        HashMap<Integer, String> info = new HashMap<>();
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, realtor_id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                info.put(
                        rs.getInt("realty_id"),
                        rs.getString("deal_info")
                );
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return info;
    }

    public static void delete(int realty_id) {

        String sql = "DELETE FROM deal WHERE realty_id = ?";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setInt(1, realty_id);
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
