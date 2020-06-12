package entities;

import java.io.Serializable;
import java.util.Date;

public class Realty implements Serializable {

    private int realty_id;
    private int in_price;
    private int mort_price;
    private int cash_price;
    private int realtor;
    private Date delivery_date;
    private Integer street;
    private Integer res_complex;
    private Integer district;
    private int city;
    private String building;
    private float square;
    private int square_unit;
    private Integer room_count;
    private Integer floor;
    private Integer owner;
    private Integer docs_type;
    private Integer own_type;
    private Integer obj_type;
    private String comment;

    public Realty(int realtor) {
        this.realtor = realtor;
    }

    public Realty(int realty_id, int in_price, int mort_price, int cash_price,
                  int realtor, Date delivery_date, Integer street,
                  Integer res_complex, Integer district, int city, String building,
                  float square, int square_unit, Integer room_count, Integer floor,
                  Integer owner, Integer docs_type, Integer obj_type, String comment) {
        this.realty_id = realty_id;
        this.in_price = in_price;
        this.mort_price = mort_price;
        this.cash_price = cash_price;
        this.realtor = realtor;
        this.delivery_date = delivery_date;
        this.street = street;
        this.res_complex = res_complex;
        this.district = district;
        this.city = city;
        this.building = building;
        this.square = square;
        this.square_unit = square_unit;
        this.room_count = room_count;
        this.floor = floor;
        this.owner = owner;
        this.docs_type = docs_type;
        this.obj_type = obj_type;
        this.comment = comment;
    }

    public Integer getOwn_type() {
        return own_type;
    }

    public void setOwn_type(Integer own_type) {
        this.own_type = own_type;
    }

    public int getRealty_id() {
        return realty_id;
    }

    public void setRealty_id(int realty_id) {
        this.realty_id = realty_id;
    }

    public int getIn_price() {
        return in_price;
    }

    public void setIn_price(int in_price) {
        this.in_price = in_price;
    }

    public int getMort_price() {
        return mort_price;
    }

    public void setMort_price(int mort_price) {
        this.mort_price = mort_price;
    }

    public int getCash_price() {
        return cash_price;
    }

    public void setCash_price(int cash_price) {
        this.cash_price = cash_price;
    }

    public int getRealtor() {
        return realtor;
    }

    public void setRealtor(int realtor) {
        this.realtor = realtor;
    }

    public Date getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;
    }

    public Integer getStreet() {
        return street;
    }

    public void setStreet(Integer street) {
        this.street = street;
    }

    public Integer getRes_complex() {
        return res_complex;
    }

    public void setRes_complex(Integer res_complex) {
        this.res_complex = res_complex;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public float getSquare() {
        return square;
    }

    public void setSquare(float square) {
        this.square = square;
    }

    public int getSquare_unit() {
        return square_unit;
    }

    public void setSquare_unit(int square_unit) {
        this.square_unit = square_unit;
    }

    public Integer getRoom_count() {
        return room_count;
    }

    public void setRoom_count(Integer room_count) {
        this.room_count = room_count;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public Integer getDocs_type() {
        return docs_type;
    }

    public void setDocs_type(Integer docs_type) {
        this.docs_type = docs_type;
    }

    public Integer getObj_type() {
        return obj_type;
    }

    public void setObj_type(Integer obj_type) {
        this.obj_type = obj_type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
