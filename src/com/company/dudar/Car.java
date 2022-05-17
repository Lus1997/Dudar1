package com.company.dudar;

public class Car extends Transport implements Array {


    @Override
    public void move() {
        System.out.println("Car");
    }

    @Override
    public int get(int i) {
        return 0;
    }

    @Override
    public boolean add(int val) {
        return false;
    }
}
