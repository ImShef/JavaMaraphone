package PracticueOOP;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-18);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        person1.speak();


    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
        name = userName;
        }
    }
    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Возраст должен быть положительный!");
        } else {
        age = userAge;
        }
    }
    public int getAge() {
        return age;
    }
    int calcululateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }
    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }

    void sayHello() {
        System.out.println("Привет!");
    }
}