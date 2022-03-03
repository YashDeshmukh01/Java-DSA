package com.yash;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//      fun(2,3,4,5,87,65);
        multiple(2,3,"kunal", "Rahul");

    }

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v){

        System.out.println(Arrays.toString(v));
    }
}
