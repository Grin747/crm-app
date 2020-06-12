package entities;

import java.io.Serializable;
import java.util.Date;

public class Deal implements Serializable {
    private int client;
    private int realty;
    private int realtor;
    private int profit;
    private Date deal_date;

    public Deal(int client, int realty, int realtor, int profit, Date deal_date) {
        this.client = client;
        this.realty = realty;
        this.realtor = realtor;
        this.profit = profit;
        this.deal_date = deal_date;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public int getRealty() {
        return realty;
    }

    public void setRealty(int realty) {
        this.realty = realty;
    }

    public int getRealtor() {
        return realtor;
    }

    public void setRealtor(int realtor) {
        this.realtor = realtor;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public Date getDeal_date() {
        return deal_date;
    }

    public void setDeal_date(Date deal_date) {
        this.deal_date = deal_date;
    }
}
