package com.yash;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//	int[] arr = new int[5];
//	    arr[0] = 23;
//        arr[1] = 234;
//        arr[2] = 233;
//        arr[3] = 223;
//        arr[4] = 3;
//        // [23 , 234, 233, 223, 3]
//        System.out.println(arr[3]);

        // inputs using for loops

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] =in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//
//        for(int num : arr) { // for every element in array, print the element
//            System.out.print(num + " "); // here num represents element of the array
//        }

        // array of objects

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Yash";

        System.out.println(Arrays.toString(str));


    }
}
