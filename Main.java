package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 8, 6, 1, 7, 2, 9, 3, 4, 4, 5, 2, 1, 1, 0, 0};
        tekrar(arr);
    }

    public static void tekrar(int[] arr) {
        int[] evenNum = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i!=j && arr[i] == arr[j] && arr[i] % 2 == 0) {
                    evenNum[count] = arr[i];
                    count++;
                }
            }
        }
        for (int num: evenNum) {
            System.out.print(num+",");
        }
    }
}
