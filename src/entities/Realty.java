package entities;

import java.io.Serializable;
import java.util.Date;

public class Realty implements Serializable {

    private int realty_id;
    private double in_price;
    private double mort_price;
    private double cash_price;
    private double commission;
    private int realtor;
    private Date delivery_date;
    private int street;
    private int res_complex;
    private int district;
    private int city;
    private String building;
    private float square;
    private int square_unit;
    private int room_count;
    private int floor;
    private String cad_number;
    private int owner;
    private int own_type;
    private int docs_type;
    private int obj_type;
    private String comment;

    public int getRealty_id() {
        return realty_id;
    }

    public void setRealty_id(int realty_id) {
        this.realty_id = realty_id;
    }

    public double getIn_price() {
        return in_price;
    }

    public void setIn_price(double in_price) {
        this.in_price = in_price;
    }

    public double getMort_price() {
        return mort_price;
    }

    public void setMort_price(double mort_price) {
        this.mort_price = mort_price;
    }

    public double getCash_price() {
        return cash_price;
    }

    public void setCash_price(double cash_price) {
        this.cash_price = cash_price;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
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

    public int getStreet() {
        return street;
    }

    public void setStreet(int street) {
        this.street = street;
    }

    public int getRes_complex() {
        return res_complex;
    }

    public void setRes_complex(int res_complex) {
        this.res_complex = res_complex;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
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

    public int getRoom_count() {
        return room_count;
    }

    public void setRoom_count(int room_count) {
        this.room_count = room_count;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getCad_number() {
        return cad_number;
    }

    public void setCad_number(String cad_number) {
        this.cad_number = cad_number;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public int getOwn_type() {
        return own_type;
    }

    public void setOwn_type(int own_type) {
        this.own_type = own_type;
    }

    public int getDocs_type() {
        return docs_type;
    }

    public void setDocs_type(int docs_type) {
        this.docs_type = docs_type;
    }

    public int getObj_type() {
        return obj_type;
    }

    public void setObj_type(int obj_type) {
        this.obj_type = obj_type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Realty(int id, int realtor_id){
        realty_id = id;
        realtor = realtor_id;
    }
}
