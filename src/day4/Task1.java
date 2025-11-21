package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = 10;
        int min = 0;

        System.out.print("Введите длину массива: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rnd(min, max);
        }
        System.out.println("Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Информация о массиве:");
        more(arr);
        equal(arr);
        even(arr);
        odd(arr);
        sumArr(arr);
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void more(int[] arr) {
        int more = 0;
        for (int i : arr) {
            if (i > 8) {
                more ++;
            }
        }
        System.out.println("Количество чисел больше 8: " + more);
    }

    public static void equal(int[] arr) {
        int equal = 0;
        for (int i : arr) {
            if (i == 1) {
                equal++;
            }
        }
        System.out.println("Количество чисел равных 1: " + equal);
    }

    public static void sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }

    public static void even(int[] arr) {
        int even = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                even++;
            }
        }
        System.out.println("Количество четных чисел: " + even);
    }

    public static void odd(int[] arr) {
        int odd = 0;
        for (int i : arr) {
            if (i % 2 == 1) {
                odd++;
            }
        }
        System.out.println("Количество нечетных чисел: " + odd);
    }

}
