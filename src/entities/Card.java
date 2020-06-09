package entities;

import java.io.Serializable;

public class Card implements Serializable {
    private int id;
    private String title;
    private String address;
    private String price;

    public Card(int id, String title, String address, String price) {
        this.id = id;
        this.title = title;
        this.address = address;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
