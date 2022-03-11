package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("birinci kenarı giriniz");
    int first= scanner.nextInt();
    System.out.println("ikinci kenarı giriniz");
    int second= scanner.nextInt();
    System.out.println("üçüncü kenarı giriniz");
    int third= scanner.nextInt();
    int u= (first+second+third)/2;
    double alan= Math.sqrt(u* (u-first)*(u-second)*(u-third));
    System.out.println("üçgenimizin alanı :"+alan);


    }
}
