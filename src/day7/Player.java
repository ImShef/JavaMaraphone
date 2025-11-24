package day7;

import java.util.Random;

class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public int getStamina() {
        return stamina;
    }

    public Player() {
        Random rand = new Random();
        this.stamina = rand.nextInt(11) + 90;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    private  int x = 0;
    public void run() {
        if (stamina == MIN_STAMINA)
            return;

        stamina--;

        if (stamina == MAX_STAMINA)
            countPlayers--;

    }

    public static void info() {
        if (countPlayers < 0) {
            System.out.println("Команды нелолные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест!");
        }
    }
}
