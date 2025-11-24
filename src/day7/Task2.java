package day7;

public class Task2 {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        Player p5 = new Player();
        Player p6 = new Player();
        Player.info();
        for (int i = 0; i < 100; i++) {
            p1.run();
        }
        Player.info();
        Player p7 = new Player();
        Player.info();

    }
}
