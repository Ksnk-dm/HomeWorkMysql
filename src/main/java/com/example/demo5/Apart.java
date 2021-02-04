package com.example.demo5;

import java.util.Objects;

public class Apart {
private int id;
        private String district;
        private String address;
        private int area;
        private int rooms;
        private int price;

    public Apart() {
    }
    

    public Apart(String district, String address, int area, int rooms, int price) {
        this.district = district;
        this.address = address;
        this.area = area;
        this.rooms = rooms;
        this.price = price;
    }

    public Apart(String district) {
        this.district = district;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}
