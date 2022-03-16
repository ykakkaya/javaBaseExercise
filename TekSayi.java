package com.company;
import java.util.*;
public class TekSayi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        boolean isNumberOdd = false;

            while (!isNumberOdd) {
                System.out.println("bir sayı giriniz");
                int number = scanner.nextInt();
                if (number % 4 == 0) {
                    result += number;
                    System.out.println("hatalı giriş ");
                    System.out.println("yanlış girişler toplamı :" + result);
                }else if(number% 2 != 0) {
                    System.out.println("tek sayı girişi başarılı");
                    isNumberOdd = true;
                }

            }
        }
    }

