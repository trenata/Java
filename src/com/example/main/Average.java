package com.example.main;

import java.util.Scanner;

class Average {
    private Scanner input = new Scanner(System.in);

    static void average() {
        Average avg = new Average();

        int number = avg.inputNumber();

        int array[] = new int[number];
        avg.inputArray(array, number);

        int sum = avg.arraySum(array, number);

        System.out.println("\nA tomb elemeinek atlaga: " + (float) sum / number);
    }

    private int inputNumber() {
        System.out.print("Tomb elemeinek szama: ");
        return Integer.parseInt(input.nextLine());
    }

    private void inputArray(int array[], int number) {
        System.out.println("Tomb elemei:");
        for (int i = 0; i < number; i++) {
            System.out.print(i + ". ");
            array[i] = Integer.parseInt(input.nextLine());
        }
    }

    private int arraySum(int array[], int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
