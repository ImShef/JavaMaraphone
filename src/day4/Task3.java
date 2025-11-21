package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int max = 50;
        int min = 0;
        int[][] arr =  new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = rnd(min, max);
            }
        }
        System.out.println("Сгенерированная матрица:");
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("Индекс строки: " + sumArr(arr, m, n));
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static int sumArr(int[][] arr, int str, int len) {
        int sum = -1;
        int m = -1;
        for (int i = 0; i < str; i++) {
            int sumTemp = 0;
            for (int j = 0; j < len; j++) {
                sumTemp += arr[i][j];
            }
            if (sumTemp >= sum) {
                sum = sumTemp;
                m = i;
            }
        }
        return m;
    }
}
