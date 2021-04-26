package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int [] a = new int[i];
        for (int q = 0; q < a.length; q++){
            System.out.print(Math.ceil(Math.random()*10));
            System.out.println("Длина массива: " + a.length);
            
        }

    }
}
