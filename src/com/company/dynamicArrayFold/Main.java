package com.company.dynamicArrayFold;

public class Main {
    public static void main(String[] args) {
        DynamicArray arr1 = new DynamicArray();
        DynamicArray arr2 = new DynamicArray(10);


        System.out.println("Len before add " + arr2.getLength());


        arr1 = arr2.add(28);
        arr2.add(12);
        arr2.add(97);
        arr2.add(100);
        //arr1.add(new int[4]);

//        arr2.add(28);
//        arr2.add(2,32);
//        //arr2.add(3,30);
//        arr2.add(arr1);




//        for (int x: arr2.masiv) {
//            System.out.println(x);
//        }
        System.out.println("--------------------------");
        System.out.println( arr2.getLength());
       //System.out.println("index of this value " + arr2.getIndex(100));
    }
}
