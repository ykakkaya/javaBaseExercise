package com.company;

public class Main {

    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5};
        hesapla(numbers);

    }
    public static void hesapla(int[] arr){
        double result=0;
        for(int i=0; i< arr.length; i++){

            result+=(1.0/arr[i]);

        }
        System.out.println("sonucumuz: "+result);
    }
}
