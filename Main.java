package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isControl = true;
        boolean isControl2=true;
        System.out.println("bir sayı giriniz");
        int number = scanner.nextInt();
        int temp=number;
        System.out.print(number + " ");
        while (isControl) {

            number -= 5;
            System.out.print(number + " ");
            if (number < 0 || number == 0) {
                while (isControl2) {
                    number += 5;
                    System.out.print(number + " ");
                    if (number == temp) {
                        isControl = false;
                        isControl2=false;
                    }
                }
            }
        }


    }
}