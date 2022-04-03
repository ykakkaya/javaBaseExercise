package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random r=new Random(100);
        int number=r.nextInt(100);
        int tahmin=-1;
        int count=0;
        while (tahmin!=number){
            System.out.println("girilen sayiyi tahmin ediniz.Bir sayi giriniz");
            tahmin= scanner.nextInt();
            count++;
            if(tahmin<number){
                System.out.println("daha buyuk bir sayi giriniz");
            }else if (tahmin>number){
                System.out.println("daha kucuk bir sayi giriniz");
            }else if(tahmin==number){
                System.out.println("dogru tahminde bulundunuz \n deneme sayiniz : "+count);
            }
        }
    }
}
