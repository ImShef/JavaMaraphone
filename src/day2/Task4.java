package day2;

import java.util.Scanner;;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("При x >= 5, будет считаться y по этой формуле:");
        System.out.println("(x^2 - 10) / (x + 7)");
        System.out.println("При -3 < x < 5, будет считаться y по этой формуле:");
        System.out.println("(x + 3)*(x^2 - 2)");
        System.out.println("В остальных случаях будет: 420\n");

        System.out.print("Введите число x: ");
        double x = s.nextDouble();

        double y;

        if ( x >= 5 ) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
        } else if (x > -3) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
        } else {
            y = 420;
        }
        System.out.println("y = " + y);

    }

}
