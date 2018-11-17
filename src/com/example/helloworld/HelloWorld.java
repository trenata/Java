package com.example.helloworld;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
    int number;
    System.out.println("0. Kilepes\n1. Hello World!\n2. Jatek");

        do {
            Scanner input = new Scanner(System.in);
            number = input.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Hello, World!");
                    break;
            }
        }while(number!=0);
    }
}
