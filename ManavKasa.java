package com.company;
import java.util.*;
public class ManavKasa {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
	System.out.println("armut kaç kg ?");
    float armut= scanner.nextFloat();
    System.out.println("elma kaç kg ?");
    float elma= scanner.nextFloat();
    System.out.println("domates kaç kg ?");
    float domates= scanner.nextFloat();
    System.out.println("muz kaç kg ?");
    float muz= scanner.nextFloat();
    System.out.println("patlıcan kaç kg ?");
    float patlıcan= scanner.nextFloat();
    float result= (float) ((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5.00));
    System.out.println("toplam ödenecek miktar :" +result);

    }
}

