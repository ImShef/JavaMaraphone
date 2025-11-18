package PracticueScanner;
import java.util.Scanner;
public class inputJava {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите какое нибудь число");
        int x = s.nextInt();
        System.out.println("Вы ввели: " + x);
    }
}
