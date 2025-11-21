package day5;

import java.time.Month;

public class Task2 {
    public static void main(String[] args) {
        Motorbike moto1 = new Motorbike(1999, "Black", "Yamaha");
        System.out.println("Дата выпуска: " + moto1.getReleaseYear());
        System.out.println("Цвет мотоцикла: " + moto1.getColor());
        System.out.println("Модель мотоцикла: " + moto1.getModel());
    }
}



