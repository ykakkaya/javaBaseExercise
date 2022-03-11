package com.company;

import java.util.Scanner;

public class DaireDilimAlanı {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float pi= (float) 3.14;
        System.out.println("dairenin yarıçapını giriniz");
        float r= scanner.nextFloat();
        System.out.println("kaç derecelik daire dilim alanı hesaplanacak");
        Float acı= scanner.nextFloat();
        Float alan= (acı/360)*pi*r*r;
        System.out.println(acı+" derecelik daire dilim alanımız :" + alan);


    }
}
