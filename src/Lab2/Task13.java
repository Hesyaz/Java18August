package Lab2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        double edge;
        double height;
        double area;

        Scanner s;
        s = new Scanner(System.in);
        edge= s.nextDouble();
        height = s.nextDouble();

        if (edge <=0) {
            System.out.println("Длина основания треугольника должна быть положительна");
            return;
        }
        if (height <=0) {
            System.out.println("Высота треугольника должна быть положительн");
            return;
        }
        area = edge*height/2;
        System.out.println(area);




    }
}
