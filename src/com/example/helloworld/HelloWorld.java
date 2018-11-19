package com.example.helloworld;

import java.util.Scanner;
import java.util.Random;

public class HelloWorld {
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
                    Random rand = new Random();
                    int n = rand.nextInt(99) + 1;
                    int lives = 5, m;
                    boolean win = false;

                    System.out.println("Talald ki milyen szamra gondoltam 1 es 100 kozott! 5 eleted van.");

                    while (lives != 0 && !win) {
                        System.out.print("Tipped: ");
                        while (true)
                            try {
                                m = Integer.parseInt(input.nextLine());
                                break;
                            } catch (NumberFormatException nfe) {
                                System.out.print("Szamot irj: ");
                            }
                        if (m < n) {
                            System.out.println("Probalj egy NAGYOBB szamot.");
                            lives--;
                        } else if (m > n) {
                            System.out.println("Probalj egy KISEBB szamot.");
                            lives--;
                        } else
                            win = true;
                        
                        if (lives != 0 && !win)
                            System.out.println(lives + " eleted maradt");
                    }
                    if (win)
                        System.out.println("\nNYERTEEL!");
                    else
                        System.out.println("\nVesztettel..., a szam amire gondoltam " + n + " volt");
                    break;
            }
        } while (number != 0);
    }
}
