package com.company;
import java.util.*;

public class BaseCalculator {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        float firstNumber= scanner.nextFloat();;
        System.out.println("ikinci sayıyı giriniz");
        float secondNumber= scanner.nextFloat();;
        System.out.println("yapılacak işlemi seçiniz : 1 toplama\n 2 çıkarma\n 3 çarpma\n 4 bölme");
        int select= scanner.nextInt();
        switch (select){
            case 1: System.out.println(firstNumber+secondNumber);
            break;
            case 2:System.out.println(firstNumber-secondNumber);
            break;
            case 3:System.out.println(firstNumber*secondNumber);
            break;
            case 4:if(secondNumber!=0) {
                System.out.println(firstNumber / secondNumber);
            }else{
                System.out.println("sonucumuz tanımsız");
            }
        }


    }
}
