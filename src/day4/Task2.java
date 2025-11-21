package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int n = 100;
        int[] arr = new int[n];
        int max = 10000;
        int min = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = rnd(min, max);
        }
        System.out.println("Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(arr));
        big(arr);
        min(arr);
        nullArr(arr);
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void big(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
    }

    public static void min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Наибольший элемент массива: " + min);
    }

    public static void nullArr(int[] arr) {
        int nullA = 0;
        int sum = 0;
        for (int i : arr) {
            if (i % 10 == 0) {
                nullA++;
                sum += i;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + nullA);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
