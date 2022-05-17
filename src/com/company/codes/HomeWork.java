package com.company.codes;

class Numbers {
    int a, b, c;

    Numbers(Numbers ob) {
        a = ob.a;
        b = ob.b;
        c = ob.c;
    }

    Numbers(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }


    Numbers max() {
        Numbers ob1 = new Numbers(a, b, c);
        int Maximum = 0;
        if (ob1.a > ob1.b && ob1.a > c)
            Maximum = ob1.a;
        else if (ob1.b > ob1.c)
            Maximum = ob1.b;
        else Maximum = ob1.c;
        System.out.println(Maximum);


        return ob1;

    }


}

public class HomeWork {
    public static void main(String[] args) {


        Numbers num1 = new Numbers(12, 25, 11);
        num1.max();


    }
}
