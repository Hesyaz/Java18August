package Lab2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {

        double volume1,volume2,volume,temperature1,temperature2,temperature;

        Scanner s;
        s = new Scanner(System.in);
        volume1 = s.nextDouble();
        temperature1 = s.nextDouble();
        volume2 = s.nextDouble();
        temperature2 = s.nextDouble();

        volume = volume1 + volume2;
        if (volume1 <= 0) {
            System.out.println("Объем должен быть неотрицательным");
            return;
        }
        if (volume2 <= 0) {
            System.out.println("Объем должен быть неотрицательным");
            return;
        }

        temperature = (((temperature1*volume1)+(temperature2*volume2))/volume);
        System.out.printf("Объем %.4f\n",volume);
        System.out.printf("Температура %.4f",temperature);
    }


}
