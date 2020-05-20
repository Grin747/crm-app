package entities;

import java.io.Serializable;
import java.util.Date;

public class Realty implements Serializable {

    private int id;

    private int floor;
    public float square;
    public int room_count;

    public long in_price;
    public long cash_price;
    public long mort_price;
    public float commission;

    public Date delivery_date;
    public String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
