package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите делимое и делитель: ");
            double deli = s.nextDouble();
            double dell = s.nextDouble();
            if (dell == 0) {
                System.out.println("Деление на 0!");
                continue;
            }
            System.out.println(deli/dell);
        }
    }
}
