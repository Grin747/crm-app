package cruds;

import entities.Realty;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class RealtyCrud extends Crud {

    public static void add(Realty realty){

    }

    public static ArrayList<String> get_titles(){
        ArrayList<String> titles = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("select get_title() as title");

            while (resultSet.next()){
                titles.add(resultSet.getString("title"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return titles;
    }

    //public static ArrayList<>
}
