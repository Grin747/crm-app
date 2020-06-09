package cruds;

import entities.Deal;

import java.sql.Date;
import java.sql.PreparedStatement;

public class DealCrud extends Crud {
    public static void add(Deal deal){
        String sql = "insert into deal (client, realty, realtor, deal_date, profit) " +
                "values (?, ?, ?, ?, cast(? as money))";
        try(PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, deal.getClient());
            statement.setInt(2, deal.getRealty());
            statement.setInt(3, deal.getRealtor());
            statement.setDate(4, new Date(deal.getDeal_date().getTime()));
            statement.setDouble(5, deal.getProfit());

            statement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
