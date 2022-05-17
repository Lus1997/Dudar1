package com.company.dudar;

public class Student extends Person{
    int course = 1;

    void tell () {
        System.out.println(super.name);
        System.out.println(super.height);
        System.out.println(course);
    }

    public Student () {}

    public Student (int height, String name, int course) {
        super(height, name);
        this.course = course;
    }
}
