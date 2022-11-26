package com.example.myapplication;

public class Trail_bal_Class {
    String desc;
    String debit;
    String credit;

    public Trail_bal_Class(String desc, String debit, String credit) {
        this.desc = desc;
        this.debit = debit;
        this.credit = credit;
    }
    public String get_Desc() {
        return desc;
    }

    public void set_Desc(String desc) {
        this.desc = desc;
    }

    public String get_Debit() {
        return debit;
    }

    public void set_Debit(String debit) {
        this.debit = debit;
    }

    public String get_Credit() {
        return credit;
    }

    public void set_Credit(String credit) {
        this.credit = credit;
    }
}
