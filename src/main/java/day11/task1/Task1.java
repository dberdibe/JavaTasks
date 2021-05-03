package day11.task1;
//Этот метод в качестве аргумента принимает объект класса, реализующего интерфейс Worker.
//В теле этого метода на объекте worker должен 10.000 раз вызываться метод doWork(),
//и после этого должен быть один раз вызван метод bonus().
//
// Для демонстрации и тестирования работы программы, в методе main() создайте склад и по 1 рабочему.
//Свяжите этих двух рабочих со складом. После этого, вызовите метод businessProcess(Worker worker),
//передавая в качестве аргумента сотрудника. Вызовите метод сначала для сборщика, а потом для курьера.
//Выведите в консоль количество собранных и доставленных заказов на складе и ЗП каждого из сотрудников.
//Создайте второй склад, на который также “примите” по 1 новому сотруднику. Вызовите один раз метод doWork()
//у сотрудников второго склада. Проконтролируйте, что у склада 1 и его сотрудников при этом значения не меняются.

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        businessProcess(picker);

        System.out.println(picker);
        System.out.println(warehouse);

        businessProcess(courier);

        System.out.println(courier);
        System.out.println(warehouse);



    }

    static void businessProcess(Worker worker){
        for (int i = 0; i < 10001; i++){
            worker.doWork();
        }
        worker.bonus();

    }
}
