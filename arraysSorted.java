package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    System.out.println("dizinin boyutunu giriniz");
        Scanner scanner=new Scanner(System.in);
        int boyut= scanner.nextInt();
        int[]arr=new int[boyut];
        for(int i=0; i<boyut; i++){
        System.out.println("dizi elemanı giriniz");
        arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int a: arr) {System.out.print(+a+",");

        }
    }
}
