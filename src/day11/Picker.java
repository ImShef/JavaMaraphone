package day11;

class Picker implements Worker {
    private int salary;
    private boolean isBonusPaid = false;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void  doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }


    @Override
    public void bonus() {
        if (!isBonusPaid && warehouse.getCountOrder() == 1500) {
            salary *= 3;
            isBonusPaid = true;
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
