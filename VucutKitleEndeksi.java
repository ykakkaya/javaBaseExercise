package com.company;

import java.util.Scanner;

public class VucutKitleEndeksi {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("boyunuzu giriniz");
        float boy= scanner.nextFloat();
        System.out.println("kilonuzu giriniz :");
        float kilo= scanner.nextFloat();
        float result= kilo/(boy*boy);
        System.out.println("vücut kitle endeksiniz :" + result);
    }
}
