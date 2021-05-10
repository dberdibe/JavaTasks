package day12.task3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//Создать класс Музыкальная Группа (англ. MusicBand) с полями name и  (название музыкальной группы и год основания).
// Создать 10 или более экземпляров класса MusicBand , добавить их в список
// (выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен).
public class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
