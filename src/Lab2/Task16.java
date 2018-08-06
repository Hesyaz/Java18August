package Lab2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        double radius;
        double volume;
        Scanner s;
        s = new Scanner(System.in);
        radius = s.nextDouble();
        if (radius<=0){
            System.out.println("Значение радиуса должно быть положительным");
            return;
        }
        volume =4 * Math.PI *(radius*radius*radius)/3;
        System.out.printf("Объем шара равен %.4f",volume);
    }

}
