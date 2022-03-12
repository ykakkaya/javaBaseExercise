package com.company;
import  java.util.*;
public class EtkinlikOneri {

    public static void main(String[] args) {
	    Scanner scanner= new Scanner(System.in);
        System.out.println("hava sıcaklığını giriniz");
        int derece=scanner.nextInt();
        if (derece<5){
            System.out.println("kayak yapabilirsiniz");
        }else if(5<=derece && derece<15){
            System.out.println("sinemaya gidebilirsiniz");

        }else if (15<=derece && derece<25){
            System.out.println("pikniğe gidebilirsiniz");

        }else if(25<=derece){
            System.out.println("yüzmeye gidebilirsiniz");
        }
    }
}
