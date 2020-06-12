package cruds;

import entities.Client;
import entities.Realtor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ClientCrud extends Crud {
    public static void add(Client client) {
        String sql = "insert into client (phone, name, surname, patronymic, passport_number) " +
                "values (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
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

    public static ArrayList<Client> select() {
        ArrayList<Client> clients = new ArrayList<>();

        try (Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM client");

            while (resultSet.next()) {
                Client client = new Client(
                        resultSet.getInt("client_id"),
                        resultSet.getString("phone"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("patronymic"),
                        resultSet.getString("passport_number")
                );

                clients.add(client);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return clients;
    }
}
