package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter n :");
        int n = scanner.nextInt();
        for(int i = 0; i < n;i++){
            for(int j = 0;j<2*n;j++){
                if(j<=i) System.out.print(" ");
                else if (j<=n-i)System.out.print("*");
            }
            System.out.println();

        }

    }
}
