package com.company;

import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {
        float km = 0;
        double kmucret = 0;
        double ucret;
        Scanner scanner = new Scanner(System.in);
        System.out.println("gidilecek mesafeyi giriniz");
        km=scanner.nextFloat();
        kmucret = km * 2.20;
        ucret = 10 + kmucret;
        if (ucret <= 20) {
            ucret = 20;
        }
        System.out.println("ödenecek tutar :" + ucret);
    }
}
