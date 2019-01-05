package com.example.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int choice;
        System.out.println("0. Kilepes\n1. Hello World!\n2. Jatek\n3. Tomb eleminek atlaga\n4. Palindrom-e egy szo?");

        do {
            choice = main.inputChoice();

            switch (choice) {
                case 1:
                    System.out.println("\nHello, World!");
                    break;
                case 2:
                    Game.game();
                    break;
                case 3:
                    Average.average();
                    break;
                case 4:
                    Palindrome.palindrome();
                    break;
            }
        } while (choice != 0);
    }

    private int inputChoice() {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.print("\nValassz: ");
            while (true)
                try {
                    choice = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Szamot irj: ");
                }
        } while (choice < 0 || choice > 4);
        return choice;
    }
}
