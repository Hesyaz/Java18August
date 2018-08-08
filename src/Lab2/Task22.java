package Lab2;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        int aInitial,aReminder;
        Scanner s;
        s = new Scanner(System.in);
        aInitial = s.nextInt();
        aReminder = aInitial%360;
        System.out.println("Наименьшее положительное значение угла " + aReminder);


    }
}
