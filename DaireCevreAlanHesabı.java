package com.company;

import java.util.Scanner;

public class DaireCevreAlanHesabı {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dairemizin yarıçapını giriniz :");
        float r= scanner.nextFloat();
        float pi= (float) 3.14;
        float alan=pi*r*r;
        float cevre= 2*pi*r;
        System.out.println("dairenin çevresi :" + cevre);
        System.out.println("alnımız  :"+ alan);

    }
}
