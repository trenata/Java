package com.example.main;

import java.util.Random;
import java.util.Scanner;


class Hangman {
    void hangman() {
        Hangman hg = new Hangman();
        String answer = hg.randomWord();
        String shownWord = hg.wordLength(answer);

        char yourGuess;
        int wrongAnswers = 0;
        boolean win = false;

        System.out.println("AKASZTOFA! Talald ki milyen 'szora' gondoltam. 5 eleted van.\n");
        hg.printShownWord(shownWord);


        while (!win && wrongAnswers < 5) {
            yourGuess = hg.inputGuess();

            if (answer.indexOf(yourGuess) >= 0) {
                shownWord = hg.correctGuess(answer, yourGuess, shownWord);
                hg.printShownWord(shownWord);

                if (shownWord.equals(answer)) {
                    win = true;
                }
            } else {
                wrongAnswers++;
                hg.failedAttempt(wrongAnswers);
                hg.printShownWord(shownWord);
            }
        }
        hg.checkWin(win, answer);
    }

    private void checkWin(boolean win, String answer) {
        if (win) {
            System.out.println("Nyertel, a szo '" + answer + "' volt.");
        } else {
            System.out.println("Vesztettel! A szo amire gondoltam '" + answer + "' volt.");
        }
    }

    private String wordLength(String answer) {
        String shownWord = "";

        for (int i = 0; i < answer.length(); i++) {
            shownWord = shownWord + "_";
        }

        return shownWord;
    }

    private void printShownWord(String shownWord) {
        char[] shownWordChar = shownWord.toCharArray();

        for (int i = 0; i < shownWord.length(); i++) {
            System.out.print(shownWordChar[i] + " ");
        }
        System.out.println("\n");
    }

    private String correctGuess(String answer, char guess, String shownWord) {
        char[] shownWordChar = shownWord.toCharArray();
        char[] answerChar = answer.toCharArray();

        for (int i = 0; i < answer.length(); i++) {
            if (answerChar[i] == guess) {
                shownWordChar[i] = guess;
            }
        }

        return String.valueOf(shownWordChar);
    }

    private void failedAttempt(int wrongAnswrs) {
        Stickfigures.stickfigures(wrongAnswrs);

        if (wrongAnswrs < 5) {
            System.out.println("Rossz tipp. Meg " + (5 - wrongAnswrs) + "x tippelhetsz rosszul.");
        }
    }

    private char inputGuess() {
        System.out.print("Irj be egy betut: ");

        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();

        boolean isChar = ans.matches("[a-zA-z]{1}");

        while (!isChar) {
            System.out.print("Irj be egy betut: ");
            ans = sc.nextLine();
            isChar = ans.matches("[a-zA-z]{1}");
        }

        return ans.toUpperCase().charAt(0);
    }

    private String randomWord() {
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

        return word.toUpperCase();
    }
}
