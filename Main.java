package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner= new Scanner(System.in);
        System.out.println("doğduğunuz ayı giriniz");
        int mounth= scanner.nextInt();
        System.out.println("doğduğunuz günü giriniz");
        int day= scanner.nextInt();
        if ((mounth==3  && day>=21) || (mounth==4 && day<=20)){
            System.out.println("koç burcusunuz");
        }else if ((mounth==4  && day>=21) || (mounth==5 && day<=21)){
            System.out.println("boğa burcusunuz");
        }else if ((mounth==5  && day>=22) || (mounth==6 && day<=22)){
            System.out.println("ikizler burcusunuz");
        }else if ((mounth==6  && day>=23) || (mounth==7 && day<=22)){
            System.out.println("yengeç burcusunuz");
        }else if ((mounth==7  && day>=23) || (mounth==8 && day<=22)){
            System.out.println("aslan burcusunuz");
        }else if ((mounth==8  && day>=23) || (mounth==9 && day<=22)){
            System.out.println("başak burcusunuz");
        }else if ((mounth==9  && day>=23) || (mounth==10 && day<=22)){
            System.out.println("terazi burcusunuz");
        }else if ((mounth==10  && day>=23) || (mounth==11 && day<=21)){
            System.out.println("akrep burcusunuz");
        }else if ((mounth==11  && day>=22) || (mounth==12 && day<=21)){
            System.out.println("yay burcusunuz");
        }else if ((mounth==12  && day>=22) || (mounth==1 && day<=21)){
            System.out.println("oğlak burcusunuz");
        }else if ((mounth==1  && day>=22) || (mounth==2 && day<=19)){
            System.out.println("kova burcusunuz");
        }else if ((mounth==2  && day>=20) || (mounth==3 && day<=20)){
            System.out.println("balık burcusunuz");
        }

    }
}
