package com.company;
class Test {
    int a,b;
    Test (int i, int j) {
        a=i;
        b=j;
    }
    Test (Test ob) {
        a=ob.a;
        b=ob.b;
    }

    Test avelacum() {
        Test temp = new Test(a+10, b+10);
        //  a+=10;
        // b+=10;
        return temp;
    }

    void print() {
        System.out.println(a + " " + b);
    }
    boolean equalTo (Test o) {
        if (o.a==a && o.b==b)
            return true;
        else
            return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);
        Test ob4 = new Test(ob1); //clone
        Test ob5 = new Test(ob2);
        Test myOb = new Test(ob1.avelacum());
        System.out.println(ob5.equalTo(ob1));
        System.out.println(ob1.equalTo(ob2));
        System.out.println(ob4.equalTo(ob3));
        System.out.println(myOb.equalTo(ob1));
        myOb.print();


    }
}

