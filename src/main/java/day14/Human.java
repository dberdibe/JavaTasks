package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический метод List<Person> parseFileToObjList(File file),
// который считывает содержимое того же файла people.txt, создает экземпляры класса “Человек” и возвращает список объектов.
// Получить данный список в методе main() и распечатать его в консоль.
//В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение
// и выводить в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно,
// необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
public class Human {
    private String name;
    private int year;

    public Human(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
