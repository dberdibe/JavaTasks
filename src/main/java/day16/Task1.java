package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/daurenberdibekov/IdeaProjects/JavaMarathon2021/src/main/java/day14/TextFile");
        printResult(file);
    }
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String[] numbers = scanner.nextLine().split(" ");

        double sumResult = 0;
        int sumNumber = 0;
        for (int i = 0; i < numbers.length; i++){
            sumNumber = Integer.parseInt(numbers[i]);
            sumResult += sumNumber / (double)numbers.length;
        }
        System.out.printf(sumResult + "----> %.3f", sumResult);




    }
}

