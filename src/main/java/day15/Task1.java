package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//с информацией о моделях и размерах обуви, которой нет на складе (количество = 0).
// Для этого реализуйте программу, которая принимает на вход csv файл и создает новый txt файл следующего содержания
// (должно получиться 11 строк):
//
//Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
//Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
//Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
//...
//
//Возникающие исключения обрабатывать (try-catch), а не пробрасывать в сигнатуре метода (throws).
public class Task1 {
    public static void main(String[] args){
        try {
            File file = new File("/Users/daurenberdibekov/IdeaProjects/JavaMarathon2021/src/main/resources/shoes.csv");
            Scanner scanner = new Scanner(file);

            File file1 = new File("/Users/daurenberdibekov/IdeaProjects/JavaMarathon2021/missingShoes");
            PrintWriter pw = new PrintWriter(file1);

            while (scanner.hasNextLine()) {
                String[] list = scanner.nextLine().split(", ");
                if (Integer.parseInt(list[2]) == 0) {
                    pw.println(list[0] + ", " + list[1] + ", " + list[2]);
                }
            }
            pw.close();
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
    }
}
