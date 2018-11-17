package com.example.helloworld;
import java.util.Scanner;
import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {
    int number;
    System.out.println("0. Kilepes\n1. Hello World!\n2. Jatek");

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("\nValassz: ");
            number = input.nextInt();

            switch (number) {
                case 1:
                    System.out.println("\nHello, World!");
                    break;
                case 2:
                    Random rand = new Random();
                    int  n = rand.nextInt(99) + 1;

                    Scanner input2 = new Scanner(System.in);

                    int lives = 5, m;
                    boolean win = false;

                    System.out.println("Talald ki milyen szamra gondoltam 1 es 100 kozott! 5 eleted van.");

                    while(lives != 0 && !win){
                        System.out.print("Tipped: ");
                        m = input2.nextInt();

                        if (m < n) {
                            System.out.println("Probalj egy NAGYOBB szamot.");
                            lives--;
                        }
                        else if (m>n) {
                            System.out.println("Probalj egy KISEBB szamot.");
                            lives--;
                        }
                        else
                            win = true;
                        if(lives != 0 && !win)
                            System.out.println(lives + " eleted maradt");
                    }
                    if(win)
                        System.out.println("NYERTEEL!");
                    else
                        System.out.println("Vesztettel...");
                    break;
            }
        }while(number!=0);
    }
}
