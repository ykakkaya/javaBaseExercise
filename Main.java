package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int counter=0;
        int degree=0;
        int result=0;
        while(number!=0){

            degree=number%10;

            number/=10;

            result+=degree;

        }
        System.out.println("basamaklar toplamı :"+ result);


    }
}
