package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
	    System.out.println("bir sayı giriniz");
        int number= scanner.nextInt();
        int result=0;
        for (int i=1; i<=(number/2); i++){
            if (number%i==0){
                result+=i;
                System.out.println("i sayısı:"+i);
            }
        }
        if (number==result){
            System.out.println("sayımız mükemmel sayıdır");
        }else{
            System.out.println("sayımız mükemmel sayı değildir");
        }
    }
}
