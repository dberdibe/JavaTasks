package day2;

import java.util.Scanner;
//
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        if (x >=5){
            double i = Math.pow(x, 2);
            double o = x + 7;
            double formulaOne = (i - 10)/o;
            System.out.println(formulaOne);
        }else if (-3 < x && x < 5){
            double u = Math.pow(x, 2);
            double formulaTwo = (x + 3)*(u - 2);
            System.out.println(formulaTwo);
        } else if (x <= -3) {
            System.out.println(420.0);
        }



    }
}
