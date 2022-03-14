package com.company;
import java.util.*;
public class CinZodyagı {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("doğum yılınızı giriniz");
        int date = scanner.nextInt();
        if (date % 12 == 0) {
            System.out.println("çin zodyağı burcunuz maymun");
        } else if (date % 12 == 1) {
            System.out.println("çin zodyağı burcunuz horoz");
        } else if (date % 12 == 2) {
            System.out.println("çin zodyağı burcunuz köpek");
        } else if (date % 12 == 3) {
            System.out.println("çin zodyağı burcunuz domuz");
        } else if (date % 12 == 4) {
            System.out.println("çin zodyağı burcunuz fare");
        } else if (date % 12 == 5) {
            System.out.println("çin zodyağı burcunuz öküz");
        } else if (date % 12 == 6) {
            System.out.println("çin zodyağı burcunuz kaplan");
        } else if (date % 12 == 7) {
            System.out.println("çin zodyağı burcunuz tavşan");
        } else if (date % 12 == 8) {
            System.out.println("çin zodyağı burcunuz ejderha");
        } else if (date % 12 == 9) {
            System.out.println("çin zodyağı burcunuz yılan");
        } else if (date % 12 == 10) {
            System.out.println("çin zodyağı burcunuz at");
        } else if (date % 12 == 11) {
            System.out.println("çin zodyağı burcunuz koyun");
        }
    }
}