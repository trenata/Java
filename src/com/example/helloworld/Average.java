package com.example.helloworld;

import java.util.Scanner;

class Average {
    public static void average() {
        Scanner input = new Scanner(System.in);
        System.out.print("Tomb elemeinek szama: ");
        int n = Integer.parseInt(input.nextLine());
        int t[] = new int[n], sum = 0, nb = 0;
        System.out.println("Tomb elemei:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + ". ");
            t[i] = Integer.parseInt(input.nextLine());
            sum = sum + t[i];
            nb++;
        }
        System.out.println("\nA tomb elemeinek atlaga: " + (float) sum / nb);
    }
}
