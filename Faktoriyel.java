package com.company;
import java.util.*;
public class Faktoriyel {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("faktoriyeli hesaplanacak sayıyı giriniz");
    int number= scanner.nextInt();
    int result=1;
    for (int i=1; i<=number;i++){
        result*=i;
    }
    System.out.println("faktöriyel değeri :"+result);
    }
}
