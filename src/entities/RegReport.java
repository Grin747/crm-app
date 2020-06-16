package entities;

import java.io.Serializable;

public class RegReport implements Serializable {
    private String reg;
    private int active;
    private int sold;

    public RegReport(String reg, int active, int sold) {
        this.reg = reg;
        this.active = active;
        this.sold = sold;
    }

    public String getReg() {
        return reg;
    }

    public int getActive() {
        return active;
    }

    public int getSold() {
        return sold;
    }
}
