package com.company;
import java.util.*;

public class SınıfGecmeDurumu {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("matematik notunuz :");
        float matematik= scanner.nextFloat();

        System.out.println("fizik notunuz :");
        float fizik= scanner.nextFloat();

        System.out.println("turkce notunuz :");
        float turkce= scanner.nextFloat();

        System.out.println("kimya notunuz :");
        float kimya= scanner.nextFloat();

        System.out.println("muzik notunuz :");
        float muzik= scanner.nextFloat();

        float avg= (matematik+fizik+turkce+kimya+muzik)/5;
        if (avg>=55)
        {
            System.out.println("sınıfı geçtiniz ortalamanız : "+ avg);
        }else
        {
            System.out.println("sınıfta kaldınız");
        }

    }
}
