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


    public Apart(int id, String district, String address, int area, int rooms, int price) {
        this.id = id;
        this.district = district;
        this.address = address;
        this.area = area;
        this.rooms = rooms;
        this.price = price;
    }

    public Apart(String district, String address, int area, int rooms, int price) {
        this.district = district;
        this.address = address;
        this.area = area;
        this.rooms = rooms;
        this.price = price;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apart apart = (Apart) o;
        return id == apart.id && area == apart.area && rooms == apart.rooms && price == apart.price && Objects.equals(district, apart.district) && Objects.equals(address, apart.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, district, address, area, rooms, price);
    }

    @Override
    public String toString() {
        return "Apart{" +
                "id=" + id +
                ", district='" + district + '\'' +
                ", address='" + address + '\'' +
                ", area=" + area +
                ", rooms=" + rooms +
                ", price=" + price +
                '}';
    }
}
