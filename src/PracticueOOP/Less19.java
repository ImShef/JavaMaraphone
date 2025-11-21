package PracticueOOP;

public class Less19 {
    public static void main(String[] args) {
        Human human1 = new Human("Боб", 3);
//        human1.setAge(18);
//        human1.setName("Андрей");
//        human1.getInfo();
//        Human human2 = new Human();
//        human2.setAge(20);
//        human2.setName("Серега");
//        human2.getInfo();
    }
}

class Human{


    private String name;
    private int age;

    public Human() {
        this.name = "Боб";
        this.age = 0;
        System.out.println("Привет из 1 конструктора!");
    }

    public Human(String name) {
        System.out.println("Привет из 2 конструктора!");
        this.name = name;
    }

    public Human(String name, int age) {
        System.out.println("Привет из 3 конструктора!");
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + " " + age);
    }
}
