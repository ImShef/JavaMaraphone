package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите 2 числа a и b: ");
        int a = s.nextInt();
        int b = s.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            System.out.print("Вывод: ");
            int x = a + 1;

            while (x < b) {
                if (x % 5 == 0 && x % 10 != 0) {
                    System.out.print(x + " ");
                }
                x++;
            }

            System.out.println();
        }
    }
}
