package cruds;

import entities.Attribute;
import entities.Realtor;
import entities.Realty;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class RealtorCrud extends Crud {

    public static void add(Realtor realtor) {
        String sql = "insert into realtor (password, phone, email, name, surname, patronymic, hire_date, salary) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, realtor.getPassword());
            stmt.setString(2, realtor.getPhone());
            stmt.setString(3, realtor.getEmail());
            stmt.setString(4, realtor.getName());
            stmt.setString(5, realtor.getSurname());
            stmt.setString(6, realtor.getPatronymic());
            stmt.setDate(7, new Date(realtor.getHire_date().getTime()));
            stmt.setInt(8, realtor.getSalary());

            stmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static ArrayList<Realtor> select() {
        ArrayList<Realtor> realtors = new ArrayList<>();

        try (Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM realtor");

            while (resultSet.next()) {
                Realtor realtor = new Realtor();

                realtor.setId(resultSet.getInt("realtor_id"));
                realtor.setName(resultSet.getString("name"));
                realtor.setSurname(resultSet.getString("surname"));
                realtor.setPatronymic(resultSet.getString("patronymic"));
                realtor.setPhone(resultSet.getString("phone"));
                realtor.setPassword(resultSet.getString("password"));
                realtor.setEmail(resultSet.getString("email"));
                realtor.setHire_date(resultSet.getDate("hire_date"));
                realtor.setSalary(resultSet.getInt("salary"));

                realtors.add(realtor);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return realtors;
    }

    public static Integer auth(String phone, String pass) {
        String sql = "select auth(?, ?) as realtor";
        Integer id = null;
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, phone);
            statement.setString(2, pass);

            ResultSet rs = statement.executeQuery();
            rs.next();
            id = rs.getInt("realtor");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return id;
    }

    public static void updateSalary(int id, int salary) {
        String sql = "call update_salary(?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(2, salary);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void changePassword(int id, String password) {
        String sql = "call change_password(?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(2, password);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Realtor get(int id) {
        String sql = "select * from realtor where realtor_id = ?";
        Realtor realtor = null;

        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();

            realtor = new Realtor(
                    resultSet.getInt("realtor_id"),
                    resultSet.getString("email"),
                    resultSet.getString("phone"),
                    resultSet.getString("password"),
                    resultSet.getString("name"),
                    resultSet.getString("surname"),
                    resultSet.getString("patronymic"),
                    resultSet.getDate("hire_date"),
                    resultSet.getInt("salary")
            );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return realtor;
    }
}
