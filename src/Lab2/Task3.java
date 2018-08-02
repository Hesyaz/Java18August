package Lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a;// объявление пременных для действительных чисел
        a = s.nextDouble();
        double result;
        result = a + 7;
        System.out.printf("%.4f",result);
    }
}
