package com.example.main;

import java.util.Scanner;

class Average {
    private Scanner sc = new Scanner(System.in);
    private int number, array[], sum = 0;

    Average() {
        inputNumber();
        array = new int[number];
        inputArray();
        arraySum();

        System.out.println("\nA tomb elemeinek atlaga: " + (float) sum / number);
    }

    private void inputNumber() {
        System.out.print("Tomb elemeinek szama: ");

        while (true) {
            try {
                number = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Szamot irj: ");
            }
        }
    }

    private void inputArray() {
        System.out.println("Tomb elemei:");
        for (int i = 0; i < number; i++) {
            System.out.print(i + ". ");

            while (true) {
                try {
                    array[i] = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Szamot irj: ");
                }
            }
        }
    }

    private void arraySum() {
        for (int i = 0; i < number; i++) {
            sum = sum + array[i];
        }
    }
}
