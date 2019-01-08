package com.example.main;

import java.util.Scanner;

class Palindrome {
    private String word;
    private boolean same;

    Palindrome() {
        inputWord();
        sameCopy();

        if (same)
            System.out.println("A szo palindorm.");
        else
            System.out.println("A szo NEM palindrom.");
    }

    private void inputWord() {
        System.out.print("Adja meg a szot: ");

        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
    }

    private void sameCopy() {
        char[] copy = word.toCharArray();
        same = true;

        for (int i = 0; i <= copy.length / 2; i++) {
            if (copy[i] != copy[copy.length - i - 1])
                same = false;
        }
    }
}
