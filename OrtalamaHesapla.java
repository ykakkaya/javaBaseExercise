package com.company;
import java.util.*;
public class OrtalamaHesapla {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("matematik notunuzu giriniz");
        float math = s.nextFloat();
        System.out.println("fizik notunuzu giriniz");
        float fizik = s.nextFloat();
        System.out.println("kimya notunuzu giriniz");
        float kimya = s.nextFloat();
        System.out.println("türkçe notunuzu giriniz");
        float turkce = s.nextFloat();
        System.out.println("tarih notunuzu giriniz");
        float tarih = s.nextFloat();
        System.out.println("müzik notunuzu giriniz");
        float muzik = s.nextFloat();
        float avg = (math + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("ortalamanız  =" + avg);
       
        String durum = (avg >= 60) ? "geçtiniz" : "kaldınız";
        System.out.println(durum);
    }
}