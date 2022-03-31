package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            int [] list = {15,12,788,1,-1,-778,2,0};
            int a;
            int x=0;
            int y=0;
            Scanner input = new Scanner(System.in);

            System.out.println("Dizi : " + Arrays.toString(list));
            System.out.print("bir sayı giriniz : ");
            a = input.nextInt();

            Arrays.sort(list);

            for (int i =list.length-1; i>=0;i--){
                if(a>list[i]){
                    x = list[i];
                    break;
                }
            }
            for (int j =0; j<list.length-1;j++){
                if(a<list[j]){
                    y = list[j];
                    break;
                }
            }
            System.out.println("Girilen sayıdan küçük en yakın değer : " + x);
            System.out.println("Girilen sayıdan büyük en yakın değer : " + y);
        }
    }

