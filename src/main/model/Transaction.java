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
        return ("\n|| Description: " + desc + "            Amount: " + amount + " ||");
    }

    //EFFECTS: returns this
    public Transaction getTrans() {
        return this;
    }

    //EFFECTS: returns field amount
    public double getAmount() {
        return this.amount;
    }

    //EFFECTS: return field description
    public String getDesc() {
        return this.desc;
    }

    // MODIFIES: this
    // EFFECTS: sets field to passed in variable
    public void setDesc(String desc) {
        this.desc = desc;
    }

    // MODIFIES: this
    // EFFECTS: sets field to passed in variable
    public void setAmount(double amount) {
        this.amount = amount;
    }
}

