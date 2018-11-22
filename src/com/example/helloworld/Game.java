package com.example.helloworld;

import java.util.Random;
import java.util.Scanner;

class Game {
    public static void game(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int n = rand.nextInt(99) + 1;
        int lives = 5, m;
        boolean win = false;

        System.out.println("\nTalald ki milyen szamra gondoltam 1 es 100 kozott! 5 eleted van.\n");

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
    }
}
