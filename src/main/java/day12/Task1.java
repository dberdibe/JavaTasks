package day12;

import java.util.ArrayList;

//Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
// Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Вывести список в консоль.
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("bmw");
        list.add("audi");
        list.add("mercedes");
        list.add("toyota");
        list.add("kia");
        System.out.println(list);

        list.add(2,"akcent");
        list.remove(0);
        System.out.println(list);

    }
}
