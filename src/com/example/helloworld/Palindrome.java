package com.example.helloworld;

import java.util.Scanner;

class Palindrome {
    public static void palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a szot: ");
        String word = sc.nextLine();
        char[] copy = word.toCharArray();
        boolean p = true;
        for (int i = 0; i <= copy.length / 2; i++) {
            if (copy[i] != copy[copy.length - i - 1])
                p = false;
        }
        if (p)
            System.out.println("A szo palindorm");
        else
            System.out.println("A szo nem palindrom");
    }

}
