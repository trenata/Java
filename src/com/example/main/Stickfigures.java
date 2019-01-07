package com.example.main;

class Stickfigures {
    static void stickfigures(int wrongAnswers) {
        Stickfigures sf = new Stickfigures();

        switch (wrongAnswers) {
            case 0:
                sf.head();
                break;
            case 1:
                sf.head();
                break;
            case 2:
                sf.face();
                break;
            case 3:
                sf.body();
                break;
            case 4:
                sf.hands();
                break;
            case 5:
                sf.legs();
                break;
        }
    }

    private void head() {
        System.out.println(
                " _____\n" +
                        "|   __|__\n" +
                        "|  /     \\ \n" +
                        "|  |     |\n" +
                        "|  \\ ___ /\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|\n"

        );
    }

    private void face() {
        System.out.println(
                " _____\n" +
                        "|   __|__\n" +
                        "|  / * * \\ \n" +
                        "|  |  ^  |\n" +
                        "|  \\ _-_ /\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|\n"
        );
    }

    private void body() {
        System.out.println(
                " _____\n" +
                        "|   __|__\n" +
                        "|  / * * \\ \n" +
                        "|  |  ^  |\n" +
                        "|  \\ _-_ /\n" +
                        "|     |\n" +
                        "|     |  \n" +
                        "|     |   \n" +
                        "|     |\n" +
                        "|\n" +
                        "|\n" +
                        "|\n"
        );
    }

    private void hands() {
        System.out.println(
                " _____\n" +
                        "|   __|__\n" +
                        "|  / * * \\ \n" +
                        "|  |  ^  |\n" +
                        "|  \\ _-_ /\n" +
                        "|     |\n" +
                        "|    /|\\ \n" +
                        "|   / | \\ \n" +
                        "|     |\n" +
                        "|\n" +
                        "|\n" +
                        "|\n"
        );
    }

    private void legs() {
        System.out.println(
                " _____\n" +
                        "|   __|__\n" +
                        "|  / * * \\ \n" +
                        "|  |  ^  |\n" +
                        "|  \\ _-_ /\n" +
                        "|     |\n" +
                        "|    /|\\ \n" +
                        "|   / | \\ \n" +
                        "|     |\n" +
                        "|     /\\ \n" +
                        "|   _/  \\_ \n" +
                        "|\n"
        );
    }
}
