package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	System.out.println("hangi sayının harmonik serisini bulmak istiyorsunuz");
    Scanner scanner=new Scanner(System.in);
    int number=scanner.nextInt();
    double result=0.0;
    for (double i=1; i<=number;i++){
        result += (1/i);
    }
    System.out.println("harmonik seri sonucu :"+ result);
    }
}
