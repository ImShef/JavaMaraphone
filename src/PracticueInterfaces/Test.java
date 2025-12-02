package PracticueInterfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        outputIndo(animal1);
        outputIndo(person1);
    }
    public static void outputIndo(Info info) {
        info.showInfo();
    }
}
