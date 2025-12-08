package day11;

public class TestDrive {
    public static void main(String[] args) {
        Warehouse war = new Warehouse();
        Warehouse war2 = new Warehouse();
        Picker pic = new Picker(war);
        Picker pic2 = new Picker(war2);
        Courier cou = new Courier(war);
        Courier cou2 = new Courier(war2);
        System.out.println(war);
        System.out.println(war2);
        System.out.println(cou);
        System.out.println(cou2);
        System.out.println(pic);
        System.out.println(pic2);
        for (int i = 0; i < 1500; i++) {
            pic.doWork();
            pic.bonus();
        }
        for (int i = 0; i < 1000; i++) {
            cou.doWork();
            cou.bonus();
        }
        cou2.doWork();
        pic2.doWork();
        System.out.println(war);
        System.out.println(war2);
        System.out.println(cou);
        System.out.println(cou2);
        System.out.println(pic);
        System.out.println(pic2);
        }
}

