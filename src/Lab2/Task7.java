package Lab2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int aDeg;
        Scanner s;
        s = new Scanner (System.in);
        aDeg = s.nextInt();
        double aRad= aDeg*(Math.PI)/180;
        System.out.printf("%.4f" +" "+"радиан",aRad);
    }
}
