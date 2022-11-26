package com.example.myapplication;

public class record {
    String time;
    String desc1;
    String desc2;
    String debit;
    String credit;
    int bg1;
    int bg2;
    int bg3;



    public record(String time, String desc1, String desc2, String debit, String credit, int bg1, int bg2, int bg3) {
        this.time = time;
        this.desc1 = desc1;
        this.desc2 = desc2;
        this.debit = debit;
        this.credit = credit;
        this.bg1 = bg1;
        this.bg2 = bg2;
        this.bg3 = bg3;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    public String getDebit() {
        return debit;
    }

    public void setDebit(String debit) {
        this.debit = debit;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public int getBg1() {
        return bg1;
    }

    public void setBg1(int bg1) {
        this.bg1 = bg1;
    }

    public int getBg2() {
        return bg2;
    }

    public void setBg2(int bg2) {
        this.bg2 = bg2;
    }

    public int getBg3() {
        return bg3;
    }

    public void setBg3(int bg3) {
        this.bg3 = bg3;
    }
}
