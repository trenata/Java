package com.example.main;

class Stickfigures {
    Stickfigures(int wrongAnswers) {
        switch (wrongAnswers) {
            case 0:
                head();
                break;
            case 1:
                head();
                break;
            case 2:
                face();
                break;
            case 3:
                body();
                break;
            case 4:
                hands();
                break;
            case 5:
                legs();
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
