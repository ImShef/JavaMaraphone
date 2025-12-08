package day11;

class Courier implements Worker {
    private int salary;
    private boolean isBonusPaid = false;
    private final Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void  doWork() {
        salary += 100;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1000);
    }

    @Override
    public void bonus() {
        if (!isBonusPaid && warehouse.getBalance() == 1_000_000) {
            salary *= 2;
            isBonusPaid = true;
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
