package Lab2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        double radius;
        double circumference;
        Scanner s;
        s = new Scanner(System.in);
        radius = s.nextInt();
        if (radius<=0){
            System.out.println("Значение радиуса должно быть положительным");
            return;
        }
        circumference = 2* Math.PI *radius;
        System.out.printf("Значние длины окружности равно %.4f" ,circumference );


    }
}
