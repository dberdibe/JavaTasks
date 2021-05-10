package day14;

import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)  {
        File file = new File("/Users/daurenberdibekov/IdeaProjects/JavaMarathon2021/src/main/java/day14/people");
        System.out.println(parseFileToStringList(file));

    }

    public static List<String> parseFileToStringList(File file)  {
        List<String> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
                String line  = scanner.nextLine();
                String[] names = line.split(" ");

                if (Integer.parseInt(names[1]) < 0){
                    throw new IllegalArgumentException();
                }
                list.add(line);
            }
            return list;

        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        return null;
    }


}

