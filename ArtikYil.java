package com.company;
import java.util.*;
public class ArtikYil {

    public static void main(String[] args) {
	    Scanner scanner= new Scanner(System.in);
        System.out.println("Bir yıl giriniz");
        int yil= scanner.nextInt();
        if(yil%4==0)
        {
            if((yil%100==0)&&(yil%400!=0))
            {
                System.out.println("artık yıl değildir");
             }else
             {
            System.out.println("artık yıl ");
             }

        }
    }
}

