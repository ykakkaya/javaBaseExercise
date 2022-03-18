package com.company;
import  java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner= new Scanner(System.in);
        System.out.println("taban değerini giriniz");
        int taban= scanner.nextInt();
        System.out.println("üs değerini giriniz");
        int us= scanner.nextInt();
        System.out.println(Math.pow(taban,us));
    }
}
