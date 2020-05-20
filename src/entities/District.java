package entities;

import java.io.Serializable;

public class District implements Serializable {
    private int id;
    private String name;

    public District(String name){
        this.name = name;
    }

    public District(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}