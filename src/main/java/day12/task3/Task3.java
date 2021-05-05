package day12.task3;

import java.util.*;

//Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
// Создать 10 или более экземпляров класса MusicBand , добавить их в список
// (выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен).
// Перемешать список. Создать статический метод в классе Task3:
//public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
//Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп,
// основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
// из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
public class Task3 {
    public static void main(String[] args) {

        MusicBand band1 = new MusicBand("band1", 1999);
        MusicBand band2 = new MusicBand("band2", 2009);
        MusicBand band3 = new MusicBand("band3", 1998);
        MusicBand band4 = new MusicBand("band4", 1995);
        MusicBand band5 = new MusicBand("band5", 2007);
        MusicBand band6 = new MusicBand("band6", 2020);
        MusicBand band7 = new MusicBand("band7", 2021);
        MusicBand band8 = new MusicBand("band8", 2004);
        MusicBand band9 = new MusicBand("band9", 2018);
        MusicBand band10 = new MusicBand("band10", 1994);
        MusicBand band11 = new MusicBand("band11", 1990);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(band1);
        bands.add(band2);
        bands.add(band3);
        bands.add(band4);
        bands.add(band5);
        bands.add(band6);
        bands.add(band7);
        bands.add(band8);
        bands.add(band9);
        bands.add(band10);
        bands.add(band11);

        System.out.println(bands);

        Collections.shuffle(bands);

        System.out.println(bands);


        System.out.println(groupsAfter2000(bands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands){
            if(band.getYear() > 2000){
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }
}
