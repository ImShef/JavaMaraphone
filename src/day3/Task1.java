package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String rus = "Россия";
        String ita = "Италия";
        String eng = "Англия";
        String ger = "Германия";
        String err = "Неизвестная страна";
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Введите название или остановите программу, написав stop: ");
            String input = s.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Спасибо за использование программы");
                break;
            } else {
                switch(input.toLowerCase()) {
                    case "москва", "владивосток", "ростов":
                        System.out.println(rus);
                        break;
                    case "рим", "милан", "турин":
                        System.out.println(ita);
                        break;
                    case "ливерпуль", "манчестер", "лондон":
                        System.out.println(eng);
                        break;
                    case "берлин", "мюнхен", "кёльн":
                        System.out.println(ger);
                        break;
                    default:
                        System.out.println(err);
                        break;
                }
            }
        }
    }
}