package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    int first=1;
        int second=1;
        int number=first+second;
        Scanner scanner=new Scanner(System.in);
        System.out.println("kaç elemanlı olsun");
        int elemanSayisi=scanner.nextInt();

        System.out.print(first+","+second+","+number+",");
        for (int i=1; i<=(elemanSayisi-3);i++){
            first =second;
            second=number;
            number=first+second;
            System.out.print(number+",");


        }
    }
}
