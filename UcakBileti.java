package com.company;
import java.util.*;
public class UcakBileti {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mesafeyi giriniz");
        float km= scanner.nextFloat();
        System.out.println("yaşınızı giriniz");
        int age= scanner.nextInt();
        System.out.println("yolculuk tipini seçiniz 1 => tek yön; 2==> çift yön");
        int type= scanner.nextInt();
        if (km<=0 || age<0){
            System.out.println("hatalı giriş yaptınız");
        }else{
            System.out.println("toplam ödenecek tutar :"+ (km*0.10));
            if (age<12 ){
                System.out.println("%50 yaş indiriminiz var tutar :"+ ((km*0.10)*0.50));
                if (type==2){
                    System.out.println("gidiş dönüş indirimli tutar :"+ 2*((km*0.10)*0.40));
                }
            }else if ( age>12 && age<=24){
                System.out.println("%10 yaş indirimiz var ödenecek tutar :"+ ((km*0.10)*0.90));
                if (type==2){
                    System.out.println("gidiş dönüş indirimli tutar :"+ 2*((km*0.10)*0.72));
                }
            }else if ( age>=65){
                System.out.println("%30 yaş indirimiz var ödenecek tutar :"+ ((km*0.10)*0.70));
                if (type==2){
                    System.out.println("gidiş dönüş indirimli tutar :"+ 2*((km*0.10)*0.56));
                }
            }
        }
    }
}
