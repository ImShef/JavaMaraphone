package day6;

import java.util.Random;

class Teacher {
    private String name;
    private String less;

    public Teacher(String name, String less) {
        this.name = name;
        this.less = less;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLess() {
        return less;
    }

    public void setLess(String less) {
        this.less = less;
    }

    public void evaluate(Student s) {
        Random rand = new Random();
        int rnd = rand.nextInt(4) + 2;
        String grade = switch (rnd) {
            case 2 -> "неудовлетворительно";
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            default -> "отлично";
        };

        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s\n", this.name, s.getName(), this.less, grade);
    }
}
