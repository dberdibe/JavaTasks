package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i < 5){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            i++;
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a/b);
        }
    }
}
