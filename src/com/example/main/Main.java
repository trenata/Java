package com.example.main;

import java.util.Scanner;

public class Main {
    private static int choice;

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("0. Kilepes\n1. Hello World!\n2. Jatek\n3. Tomb eleminek atlaga\n4. Palindrom-e egy szo?\n5. Akasztofa");

        do {
            main.inputChoice();
            main.switchCase();
        } while (choice != 0);
    }

    private void switchCase() {
        switch (choice) {
            case 1:
                System.out.println("\nHello, World!");
                break;
            case 2:
                new Game();
                break;
            case 3:
                new Average();
                break;
            case 4:
                new Palindrome();
                break;
            case 5:
                new Hangman();
                break;
        }
    }

    private void inputChoice() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("\nValassz: ");
            while (true)
                try {
                    choice = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Szamot irj: ");
                }
        } while (choice < 0 || choice > 5);
    }
}
