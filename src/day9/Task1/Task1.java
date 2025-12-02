package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", "RPO");
        Teacher t1 = new Teacher("Rock", "Mat");
        System.out.println(s1.getGroup());
        System.out.println(t1.getLess());

        s1.printInfo();
        t1.printInfo();

        System.out.println(s1.getName());
        System.out.println(t1.getName());
    }
}
