package com.example.main;

import java.util.Random;
import java.util.Scanner;

class Game {
    private Random rand = new Random();

    private int randomNumber = rand.nextInt(99) + 1;
    private int lives = 5, yourGuess;
    private boolean win = false;


    Game() {
        System.out.println("\nTalald ki milyen szamra gondoltam 1 es 100 kozott! 5 eleted van.\n");

        while (lives != 0 && !win) {
            inputGuess();
            checkWin();

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

    private void inputGuess() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tipped: ");

        while (true) {
            try {
                yourGuess = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Szamot irj: ");
            }
        }
    }

    private void checkWin() {
        if (yourGuess == randomNumber) {
            System.out.println("\nNYERTEEL!");
            win = true;
        } else {
            win = false;
            if (yourGuess < randomNumber) {
                System.out.println("Probalj egy NAGYOBB szamot.");
            } else {
                System.out.println("Probalj egy KISEBB szamot.");
            }
        }
    }
}

