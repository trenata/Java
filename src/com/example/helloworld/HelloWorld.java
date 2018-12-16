package com.example.helloworld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int number;
        System.out.println("0. Kilepes\n1. Hello World!\n2. Jatek\n3. Tomb eleminek atlaga\n4. Palindrom-e egy szo?");

        do {
            Scanner input = new Scanner(System.in);
            do {
                System.out.print("\nValassz: ");
                while (true)
                    try {
                        number = Integer.parseInt(input.nextLine());
                        break;
                    } catch (NumberFormatException nfe) {
                        System.out.print("Szamot irj: ");
                    }
            } while (number < 0 || number > 4);

            switch (number) {
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
        } while (number != 0);
    }
}
