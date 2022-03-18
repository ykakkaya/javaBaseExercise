package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int number=scanner.nextInt();
        System.out.println(isPalindrom(number));

    }

    public static boolean isPalindrom(int number){

       int temp= number;
       int reverseNumber=0;
       int lastNumber;
       while (temp!=0){
           lastNumber= temp%10;
           reverseNumber=(reverseNumber*10)+lastNumber;
           temp/=10;
       }
       if (number==reverseNumber) {
           return true;
       }else{
            return false;
       }



       }


}
