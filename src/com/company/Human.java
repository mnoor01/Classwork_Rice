package com.company;

public class Human extends Living {
    private int hisAge;

    public int getHisAge() {
        return hisAge;
    }
    public void setHisAge(int hisAge) {
        this.hisAge= hisAge;


    }
    public void breathe() {
        System.out.println("I am breathing");
    }
    public void move() {
        System.out.println("i am moving");
    }


}
