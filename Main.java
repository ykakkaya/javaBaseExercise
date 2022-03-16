package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
        System.out.println("üssü hesaplanacak sayıyı giriniz");
        int number= scanner.nextInt();
        System.out.println("kaçıncı kuvveti alınacak");
        int pow=scanner.nextInt();
        int result=1;

        for (int i =1; i<=pow;i++){
            result*=number;
        }
        System.out.println(number+ " sayısının "+ pow+" kuvveti :"+ result);
    }
}
