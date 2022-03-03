package com.yash;

public class Comparison {
    public static void main(String[] args) {
        String a = "yash";
        String b = "yash";
        String c = a;
        System.out.println(c == a);

       // System.out.println(a==b);

        String name1 = new String("kunal");
        String name2 = new String("kunal");

        //System.out.println(name1 == name2);  //comparitor

        System.out.println(name1.equals(name2)); //method
    }
}
