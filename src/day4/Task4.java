package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int n = 100;
        int max = 10000;
        int min = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rnd(min, max);
        }
        System.out.println(Arrays.toString(arr));
        sumArr(arr, n);
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void sumArr(int[] arr, int size) {
        int sum = 0;
        int ind1 = 1;
        for  (int i = 1; i < size - 1; i++) {
            int sumT = 0;
            sumT = arr[i - 1] + arr[i] + arr[i + 1];
            if (sumT >= sum) {
                sum = sumT;
                ind1 = i - 1;
            }
        }
        System.out.println("Тройка с максимальной сумма: " + sum);
        System.out.println("Индекс первого элемента тройки: " + ind1);
        System.out.println("Та самая тройка: " + arr[ind1] + " " + arr[ind1 + 1] + " " + arr[ind1 + 2]);
    }
}
