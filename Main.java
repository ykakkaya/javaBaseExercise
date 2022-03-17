package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
        System.out.println("birinci sayıyı biriniz");
        int firstNumber= scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int secondNumber=scanner.nextInt();
        int kucuk= Math.min(firstNumber,secondNumber);
        int ebob=1;
        for (int i=1; i<=kucuk;i++){
            if (firstNumber%i==0 && secondNumber%i==0){
                ebob =i;

            }
        }
        System.out.println("ebob :"+ ebob);
        System.out.println("ekok : "+ (firstNumber*secondNumber)/ebob);
        
    }
}
