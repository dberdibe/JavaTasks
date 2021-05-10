package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }

    public static List<Human> parseFileToObjList() {
        File file = new File("/Users/daurenberdibekov/IdeaProjects/JavaMarathon2021/src/main/java/day14/people");
        List<Human> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] names = line.split(" ");

                if (Integer.parseInt(names[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                Human human = new Human(names[0], Integer.parseInt(names[1]));
                list.add(human);

            }
            return list;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
