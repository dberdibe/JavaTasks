package day14;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args){
        printSumDigits();
        printSumDigits2();

    }
    public static void printSumDigits(){
        String separator = File.separator;
        String path = separator + "Users" + separator + "daurenberdibekov"+ separator + "IdeaProjects" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator +"java" + separator + "day14" + separator + "TextFile";
        File file = new File(path);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        int sum = 0;

        while (sc.hasNextInt()){
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }

    public static void printSumDigits2(){

        File file = new File("/Users/daurenberdibekov/IdeaProjects/JavaMarathon2021/src/main/java/day14/TextFile");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        int sum = 0;

        while (sc.hasNextInt()){
            sum += sc.nextInt();
        }
        System.out.println(sum);

    }
}
