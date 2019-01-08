package com.example.main;

import java.util.Random;
import java.util.Scanner;


class Hangman {
    private String answer, shownWord = "";

    private char yourGuess;
    private int wrongAnswers = 0;
    private boolean win = false;

    Hangman() {
        randomWord();
        wordLength();

        System.out.println("AKASZTOFA! Talald ki milyen 'szora' gondoltam. 5 eleted van.\n");
        printShownWord();

        while (!win && wrongAnswers < 5) {
            inputGuess();

            if (answer.indexOf(yourGuess) >= 0) {
                correctGuess();
                printShownWord();

                if (shownWord.equals(answer)) {
                    win = true;
                }
            } else {
                wrongAnswers++;
                failedAttempt();
                printShownWord();
            }
        }
        checkWin(win, answer);
    }

    private void checkWin(boolean win, String answer) {
        if (win) {
            System.out.println("Nyertel, a szo '" + answer + "' volt.");
        } else {
            System.out.println("Vesztettel! A szo amire gondoltam '" + answer + "' volt.");
        }
    }

    private void wordLength() {
        for (int i = 0; i < answer.length(); i++) {
            shownWord = shownWord + "_";
        }
    }

    private void printShownWord() {
        char[] shownWordChar = shownWord.toCharArray();

        for (int i = 0; i < shownWord.length(); i++) {
            System.out.print(shownWordChar[i] + " ");
        }
        System.out.println("\n");
    }

    private void correctGuess() {
        char[] shownWordChar = shownWord.toCharArray();
        char[] answerChar = answer.toCharArray();

        for (int i = 0; i < answer.length(); i++) {
            if (answerChar[i] == yourGuess) {
                shownWordChar[i] = yourGuess;
            }
        }

        shownWord = String.valueOf(shownWordChar);
    }

    private void failedAttempt() {
        new Stickfigures(wrongAnswers);

        if (wrongAnswers < 5) {
            System.out.println("Rossz tipp. Meg " + (5 - wrongAnswers) + "x tippelhetsz rosszul.");
        }
    }

    private void inputGuess() {
        System.out.print("Irj be egy betut: ");

        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();

        boolean isChar = ans.matches("[a-zA-z]{1}");

        while (!isChar) {
            System.out.print("Irj be egy betut: ");
            ans = sc.nextLine();
            isChar = ans.matches("[a-zA-z]{1}");
        }
        yourGuess = ans.toUpperCase().charAt(0);
    }

    private void randomWord() {
        String words[] = {"hello",
                "cat",
                "dog",
                "dolphine",
                "flower",
                "sunshine",
                "octopus",
                "parkinglot",
                "clock",
                "java",
                "pillow",
                "lightbulb",
                "Ari",
                "phone",
                "horserace",
                "grandma",
                "sister",
                "oreo"
        };

        Random rand = new Random();
        String word = words[rand.nextInt(words.length)];

        answer = word.toUpperCase();
    }
}
