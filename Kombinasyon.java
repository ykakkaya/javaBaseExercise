package com.company;

import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kombinasyonu hesaplanacak sayıyı giriniz");
        int n = scanner.nextInt();
        System.out.println("kaçlı kombinasyon hesaplanacak");
        int r = scanner.nextInt();
        int resultn = faktoriyelHesapla(n);

        int resultr = faktoriyelHesapla(r);

        int resultp = faktoriyelHesapla((n - r));

        System.out.println("kombinasyon değerimiz :" + resultn / (resultr * resultp));

    }


    public static int faktoriyelHesapla(int number) {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }


        return result;
    }
}