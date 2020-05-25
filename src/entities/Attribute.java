package entities;

public class Attribute {
    private int id;
    private String name;

    public Attribute(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
