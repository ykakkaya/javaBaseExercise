package com.company;
import  java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç tane sayı gireceksiniz");
        int n= scanner.nextInt();
        int[]numbers=new int[n];
        for (int i=0; i<n;i++){
            System.out.println("Sayı girişi yapınız");
            int input= scanner.nextInt();
            numbers[i]=input;
        }
        Arrays.sort(numbers);
        System.out.println("min değerimiz "+ numbers[0]+ " max. değerimiz : "+ numbers[n-1] );

    }
}
