package day9.Task1;

public class Teacher extends Human {

    private String less;

    public String getLess() {
        return less;
    }

    public void setLess(String less) {
        this.less = less;
    }

    public Teacher(String name, String less) {
        super(name);
        this.less = less;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }


}
