package com.company;

public class Main {

    public static void main(String[] args) {
	    int []arr={10,20,20,10,10,20,5,20};
        againElement(arr);

    }

    public static void againElement(int[]dizi){
        for(int i=0; i< dizi.length; i++){
            int counter=0;
            for(int j=0; j< dizi.length;j++){

                if(dizi[i]==dizi[j]){
                    counter++;
                }
            }
            System.out.println(dizi[i]+ " den "+counter+" adet vardır.");
        }

    }
}
