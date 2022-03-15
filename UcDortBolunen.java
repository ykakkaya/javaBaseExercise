package com.company;

import java.util.*;

public class UcDortBolunen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int number = scanner.nextInt();
        int result=0;
        int count=0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                count++;
                result+=i;
            }
        }
        System.out.println("3 ve 4 e bölünen sayıların ortalaması  :"+ result/count);

    }
}

