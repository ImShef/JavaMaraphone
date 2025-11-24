package PracticueOOP;

public class Less19 {
    public static void main(String[] args) {
        Human h1 = new Human("Боб", 3);
        Human h2 = new Human("Сергей", 30);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human h3 = new Human("Андрей", 320);
        h3.printNumberOfPeople();

    }
}

class Human{


    private String name;
    private int age;
    private static int countPeople;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void printNumberOfPeople(){
        System.out.println("Number of people " + countPeople);
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

