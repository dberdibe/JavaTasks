package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist member1 = new MusicArtist("Max", 19);
        MusicArtist member2 = new MusicArtist("Alex", 20);
        MusicArtist member3 = new MusicArtist("Julia", 23);
        MusicArtist member4 = new MusicArtist("Misha", 21);
        MusicArtist member5 = new MusicArtist("Anya", 25);

        List<MusicArtist> listMembers = new ArrayList<>();
        listMembers.add(member1);
        listMembers.add(member2);
        listMembers.add(member3);
        listMembers.add(member4);
        listMembers.add(member5);


        MusicBand band1 = new MusicBand("Green", 1995, listMembers);

        MusicArtist member6 = new MusicArtist("Jonas", 30);
        MusicArtist member7 = new MusicArtist("Jones", 28);
        MusicArtist member8 = new MusicArtist("Mark", 27);
        MusicArtist member9 = new MusicArtist("Sabina", 25);
        MusicArtist member10 = new MusicArtist("Dan", 40);

        List<MusicArtist> listMembers1 = new ArrayList<>();
        listMembers.add(member6);
        listMembers.add(member7);
        listMembers.add(member8);
        listMembers.add(member9);
        listMembers.add(member10);

        MusicBand band2 = new MusicBand("Reds", 1999, listMembers1);

        MusicBand.transferMembers(band1, band2);
        band2.printMembers();

    }
}
