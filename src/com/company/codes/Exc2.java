package com.company.codes;

import java.util.NoSuchElementException;

public class Exc2 {
    public static void main(String[] args) {
        int d,a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("This will not be printed");
        } catch (Exception e){
            System.out.println("Division by zero! " + e.getMessage());
            a = 0;
        }
        System.out.println("After catch statmant.");
        System.out.println(a);
    }
}

