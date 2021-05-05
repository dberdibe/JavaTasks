package day12.task4;
//Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять и
// удалять участников. Под участником понимается строка (String) с именем и фамилией. Реализовать статический
// метод слияния групп (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название метода:
// transferMembers. Этот метод принимает в качестве аргументов два экземпляра класса MusicBand. В классе MusicBand,
// реализовать метод printMembers(), печатающий список участников в консоль и метод getMembers(), возвращающий список
// участников.
//Проверить состав групп после слияния.

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;


    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;

    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
    public static void transferMembers(MusicBand a, MusicBand b){
        for (String member : a.getMembers()){
            b.getMembers().add(member);
        }
        a.getMembers().clear();
    }
    public void printMembers(){
        System.out.println(this.members);
    }
}
