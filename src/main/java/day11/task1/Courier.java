package day11.task1;


public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private final int NUMBER_OF_DELIVERED_ORDERS = 7000;
    private Warehouse w;

    public Courier(Warehouse w) {
        this.w = w;

    }

    @Override
    public void doWork() {
        salary += 100;
        w.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < NUMBER_OF_DELIVERED_ORDERS){
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed){
            System.out.println("  Бонус уже был выплачен");
            return;
        }

        salary += 50000;
        isPayed = true;
    }

    public Courier(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
