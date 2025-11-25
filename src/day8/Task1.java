package day8;

public class Task1 {
    public static void main(String[] args) {
        String numbers = "";

        long before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++)
            numbers += i + " ";

        long after = System.currentTimeMillis();

        System.out.println(numbers);

        StringBuilder sb = new StringBuilder();
        long beforeBuild = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++)
            sb.append(i).append(" ");

        long afterBuild = System.currentTimeMillis();

        System.out.println(sb.toString());

        System.out.println("Время выполнения цикла с классом String: " + (after - before));
        System.out.println("Время выполнения цикла с классом StringBuilder: " + (afterBuild - beforeBuild));
    }
}
