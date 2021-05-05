package day12;

import java.util.ArrayList;

//Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350. Вывести список.
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 30; ++i) {
            list.add(i);
            ++i;
        }
        for (int i = 300; i <= 500; ++i){
            list.add(i);
            ++i;
        }
        System.out.println(list);
    }
}
