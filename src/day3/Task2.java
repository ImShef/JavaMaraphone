package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите делимое и делитель (при вводе 0 на делителе программа останавливается): ");
        double deli = s.nextDouble();
        double dell = s.nextDouble();
        while (dell != 0) {
            System.out.println(deli/dell);
            System.out.print("Введите делимое и делитель (при вводе 0 на делителе программа останавливается): ");
            deli = s.nextDouble();
            dell = s.nextDouble();
        }
        System.out.println("Спасибо за использование программы!");
    }
}
