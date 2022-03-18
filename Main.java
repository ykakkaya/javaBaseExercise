package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("hangi işlemi yapmak istiyorsunuz : 1 toplama-- 2 çıkarma--" +
                "3 çarpma-- 4 bölme-- 5 üs alma-- 6 faktoriyel alma-- 7 mod alma-- 8 dikdörtgen çevre alan hesabı--9 çıkış");
        int select=scanner.nextInt();
        float num1=0,num2=0;
        if (select==1||select==2||select==3||select==4||select==5||select==7||select==8){
            System.out.println("birinci sayıyı giriniz");
            num1=scanner.nextFloat();
            System.out.println("ikinci sayıyı giriniz");
            num2= scanner.nextFloat();
        }
        switch (select){
            case 1:topla(num1,num2);
            break;
            case 2:cikarma(num1,num2);
            break;
            case 3:carpma(num1,num2);
            break;
            case 4: bölme(num1,num2);
            break;
            case 5: usAlma(num1,num2);
            break;
            case 6: System.out.println("faktöriyeli alınacak sayıyı giriniz");
            int number=scanner.nextInt();
            faktoriyel(number);
            break;
            case 7: mod(num1,num2);
            break;
            case 8: dikdortgen(num1,num2);
            break;
           
        }

    }

    public static void topla(float num1, float num2){
        System.out.println("Toplama işlemi sonucu : "+ (num1+num2));
    }
    public static void cikarma(float num1, float num2){
        System.out.println("Çıkarma işlemi sonucu : "+ (num1-num2));
    }
    public static void carpma(float num1, float num2){
        System.out.println("Çarpma işlemi sonucu : "+ (num1*num2));
    }
    public static void bölme (float num1, float num2){
        if (num2!=0) {
            System.out.println("Bölme işlemi sonucu : " + (num1 / num2));
        }else {
            System.out.println("Bölme işlemi sonucu : Tanımsız");
        }
    }
    public static void usAlma(float num1, float num2){
        System.out.println("Üs işlemi sonucu : "+ Math.pow(num1,num2));
    }
    public static void faktoriyel(int num){
        int result=1;
        for (int i=1; i<=num; i++){
            result *=i;
        }
        System.out.println(num +"sayısının faktöriyeli:"+ result);
    }
    public static void mod(float num1, float num2){
        System.out.println(num1+ "sayısının "+num2+ "sayısına göre modu"+ (num1%num2));
    }
    public static void dikdortgen(float num1, float num2){
        System.out.println("Dikdörtgenin çevresi : "+ 2*(num1+num2));
        System.out.println("Dikdörtgenin alanı : "+ (num1*num2));
    }

}
