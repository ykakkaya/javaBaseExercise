package com.company;
import java.util.*;
import java.math.*;
public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("birinci dik kenarı giriniz");
    int kenar1= scanner.nextInt();
    System.out.println("ikinci dik kenarı giriniz");
    int kenar2= scanner.nextInt();
    double hipotenus=(double)Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
    System.out.println("hipotenus değerğimiz :"+hipotenus);
    }
}
