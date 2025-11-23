package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teach = new Teacher("Иван", "Математика");
        Student s = new Student("Гога");
        teach.evaluate(s);
    }
}
