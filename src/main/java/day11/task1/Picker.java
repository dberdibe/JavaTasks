package day11.task1;
//Каждый раз, когда сотрудник выполняет свою работу (вызов метода doWork()),
//ему выплачивается заработная плата (сокр. ЗП) (80 — сборщику, 100 — курьеру).
//Также, при вызове doWork() у Сборщика, происходит увеличение значения поля countPickedOrders в объекте класса Warehouse на 1.
//А при вызове doWork() у Курьера, происходит увеличение значения поля countDeliveredOrders в объекте класса Warehouse на 1.
//Подумайте о том, как связать объекты работников с объектом склада (один из возможных вариантов - передавать объект склада в
//качестве аргумента при создании объектов-работников и хранить его в поле).
//
// Сотрудникам полагается бонус, в зависимости от персональных показателей: когда на складе собрано 10.000 заказов,
// Сборщику выплачивается бонус в размере 70.000. Когда клиентам доставлено 10.000 заказов, Курьеру выплачивается бонус в размере 50.000.
//Если на складе несколько сотрудников одной категории, то оценивается их коллективная работа, т.е. если 10 курьеров доставят каждый
//по 1000 заказов, то каждый курьер получит бонус.

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private final int NUMBER_OF_ORDER_IN_STORAGE = 10000;
    private Warehouse w;

    @Override
    public void doWork() {
        salary += 80;
        w.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < NUMBER_OF_ORDER_IN_STORAGE){
            System.out.println("Бонус пока не доступен");
        }
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
        }
        salary += 70000;
        isPayed = true;
    }

    public Picker(Warehouse w) {
        this.w = w;

    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
