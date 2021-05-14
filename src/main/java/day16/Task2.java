package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        Random random = new Random();
        PrintWriter pw = new PrintWriter(file1);

        for (int i = 0; i < 1000; i++){
            pw.println(random.nextInt(100));
        }
        System.out.println();
        pw.close();

        File file2 = new File("file2.txt");
        Scanner scanner = new Scanner(file1);
        PrintWriter pw2 = new PrintWriter(file2);
        int number = 0;
        int counter = 0;

        while(scanner.hasNextLine()){
            number = Integer.parseInt(scanner.nextLine());
            counter++;

            if (counter == 20){
                pw2.println(number / 20.0);

                counter = 0;
                number = 0;
            }
        }
        pw2.close();

        printResult(file1);
    }

    public static void printResult(File file1) throws FileNotFoundException {
        File file2 = new File("file2.txt");
        Scanner scanner = new Scanner(file1);
        PrintWriter pw2 = new PrintWriter(file2);
        int number = 0;
        int counter = 0;

        while(scanner.hasNextLine()){
            number = Integer.parseInt(scanner.nextLine());
            counter++;

            if (counter == 20){
                pw2.println(number / 20.0);

                counter = 0;
                number = 0;
            }
        }
        pw2.close();


        Scanner scanner2 = new Scanner(file2);

        double result = 0;
        while (scanner2.hasNextLine()) {
            result += Double.parseDouble(scanner2.nextLine());
        }
        System.out.println((int) result);
    }


}
