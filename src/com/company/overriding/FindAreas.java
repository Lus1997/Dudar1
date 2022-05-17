package com.company.overriding;

public class FindAreas {
    public static void main(String[] args) {
       // Figure f = new Figure(10, 10);
        Figure r = new Rectangle(9, 5);
        Figure t = new Triangle(5, 8);
        Figure figref;
        //figref = r;
        System.out.println("Area is " + r.area());

       // figref = t;
        System.out.println("Area is " + t.area());

       // figref = f;
       // System.out.println("Area is " + figref.area());
    }

}
