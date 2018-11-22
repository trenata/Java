package com.example.helloworld;

import java.util.Scanner;

public class HelloWorld extends Game {
    public static void main(String[] args) {
        int number;
        System.out.println("0. Kilepes\n1. Hello World!\n2. Jatek");

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
            } while (number < 0 || number > 2);

            switch (number) {
                case 1:
                    System.out.println("\nHello, World!");
                    break;
                case 2:
                    game(args);
                    break;
            }
        } while (number != 0);
    }
}
