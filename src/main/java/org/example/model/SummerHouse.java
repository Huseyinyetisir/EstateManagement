package org.example.model;


import org.example.repository.Estate;

public class SummerHouse implements Estate {

    private double price;
    private double area;
    private int numberOfRooms;

    public SummerHouse(double price, double area, int numberOfRooms) {
        this.price = price;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
}

