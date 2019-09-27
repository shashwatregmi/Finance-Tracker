package model;

import java.util.*;

public class Transaction {
    private double amount;
    private String desc;

    // REQUIRES: amount must be > 0
    // MODIFIES: this
    // EFFECTS: creates new Transaction
    public Transaction(double amount, String desc) {
        this.amount = amount;
        this.desc = desc;
    }

    //EFFECTS: returns formatted string for this
    public String getTransDetail() {
        return ("\n|| Description: " + desc + "            Amount: " + amount + " ||\n");
    }

    //EFFECTS: returns this
    public Transaction getTrans() {
        return this;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

