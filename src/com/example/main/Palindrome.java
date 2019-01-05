package com.example.main;

import java.util.Scanner;

class Palindrome {
    static void palindrome() {
        Palindrome pal = new Palindrome();

        String word = pal.inputWord();

        boolean same = pal.sameCopy(word);

        if (same)
            System.out.println("A szo palindorm.");
        else
            System.out.println("A szo NEM palindrom.");
    }

    private String inputWord() {
        System.out.print("Adja meg a szot: ");

        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private boolean sameCopy(String word) {
        char[] copy = word.toCharArray();
        boolean pal = true;

        for (int i = 0; i <= copy.length / 2; i++) {
            if (copy[i] != copy[copy.length - i - 1])
                pal = false;
        }

        return pal;
    }
}
