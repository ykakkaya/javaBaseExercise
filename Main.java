package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç basamaklı olacak");
        int basamak = scanner.nextInt();

        for (int i = 1; i <= basamak; i++) {
            for (int k = 1; k <= (basamak - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}