package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane air = new Airplane("Boeing", 1970, 30, 1000);
        air.setYear(2020);
        air.setLength(40);
        air.fillUp(30);
        air.fillUp(20);
        air.info();
    }
}
