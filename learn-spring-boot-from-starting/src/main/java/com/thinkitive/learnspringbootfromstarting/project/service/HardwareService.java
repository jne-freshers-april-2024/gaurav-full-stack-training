package com.thinkitive.learnspringbootfromstarting.project.service;


public class HardwareService {
    private int is;
    private String item;
    private float price;

    public HardwareService(int is, String item, float price) {
        this.is = is;
        this.item = item;
        this.price = price;
    }

    public int getIs() {
        return is;
    }

    public void setIs(int is) {
        this.is = is;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
