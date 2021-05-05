package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> listMembers1 = new ArrayList<>();
        listMembers1.add("Alex");
        listMembers1.add("Misha");
        listMembers1.add("Max");
        listMembers1.add("Kay");
        listMembers1.add("Greg");

        MusicBand band1 = new MusicBand("Greens", 1995, listMembers1);

        List<String> listMembers2 = new ArrayList<>();
        listMembers2.add("Chester");
        listMembers2.add("Collin");
        listMembers2.add("Kyle");
        listMembers2.add("Kenny");
        listMembers2.add("Denny");

        MusicBand band2 = new MusicBand("Reds", 2000, listMembers2);

        MusicBand.transferMembers(band1, band2);
        band2.printMembers();
        band1.printMembers();


    }
}
