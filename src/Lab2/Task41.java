package Lab2;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        double diameter,wireCoils,result,radius,okr;
        Scanner s;
        s = new Scanner(System.in);
        diameter = s.nextDouble();
        wireCoils =s.nextDouble();

        if (diameter<=0){
            System.out.println("Длина проволоки должна быть неотрицательна");
            return;
        }
        if (wireCoils<=0){
            System.out.println("Количество витков должно быть неотрицательно");
            return;
        }
        radius = diameter/2;
        okr = 2 * Math.PI * radius;
        result = wireCoils*okr;
        System.out.printf("Количество проволоки, которое можно намотать за данное количесвто витков %.1f", result);

    }
}
