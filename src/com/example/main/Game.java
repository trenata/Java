package com.example.main;

import java.util.Random;
import java.util.Scanner;

class Game {
    void game() {
        Game game = new Game();
        Random rand = new Random();

        int randomNumber = rand.nextInt(99) + 1;
        int lives = 5, yourGuess;
        boolean win = false;

        System.out.println("\nTalald ki milyen szamra gondoltam 1 es 100 kozott! 5 eleted van.\n");

        while (lives != 0 && !win) {
            yourGuess = game.inputGuess();
            win = game.checkWin(yourGuess, randomNumber);

            if (!win) {
                lives--;
                if (lives != 0) {
                    System.out.println(lives + " eleted maradt");
                }
            }
        }

        if (!win) {
            System.out.println("\nVesztettel..., a szam amire gondoltam " + randomNumber + " volt");
        }
    }

    private int inputGuess() {
        Scanner sc = new Scanner(System.in);
        int yourGuess;
        System.out.print("Tipped: ");
        while (true) {
            try {
                yourGuess = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Szamot irj: ");
            }
        }
        return yourGuess;
    }

    private boolean checkWin(int m, int n) {
        if (m == n) {
            System.out.println("\nNYERTEEL!");
            return true;
        } else if (m < n) {
            System.out.println("Probalj egy NAGYOBB szamot.");
        } else {
            System.out.println("Probalj egy KISEBB szamot.");
        }
        return false;
    }
}

