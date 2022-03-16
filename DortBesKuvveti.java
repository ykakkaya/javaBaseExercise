package com.company;
import  java.util.*;
public class DortBesKuvveti {

    public static void main(String[] args) {
	    Scanner scanner =new Scanner(System.in);


            System.out.println("bir sayı giriniz");
            int sayi=scanner.nextInt();
            for(int i=4; i<=sayi; i*=4){
                System.out.println("4'ün katları :"+i);
            }
            System.out.println("---------------------");
            for(int i=5; i<=sayi; i*=5){
                System.out.println("5'in katları :"+i);
            }



    }
}
