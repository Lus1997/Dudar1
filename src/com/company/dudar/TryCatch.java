package com.company.dudar;

public class TryCatch {
    public static void main(String[] args) {
        int [] arr = {1,2,36,8};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                try {
                    throw new Exception("Kent tiv");

                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

    }
}
