package cruds;

import entities.Client;

import java.sql.PreparedStatement;

public class ClientCrud extends Crud {
    public static void add(Client client){
        String sql = "insert into client (phone, name, surname, patronymic, passport_number) " +
                "values (?, ?, ?, ?, ?)";
        try(PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, client.getPhone());
            statement.setString(2, client.getName());
            statement.setString(3, client.getSurname());
            statement.setString(4, client.getPatronymic());
            statement.setString(5, client.getPassport_number());

            statement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
