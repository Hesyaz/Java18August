package Lab2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int xDeg;
        Scanner s;
        s = new Scanner (System.in);
        xDeg = s.nextInt();
        double aRad= xDeg*(Math.PI)/180;
        double result;
        result= Math.sin(aRad);
        System.out.printf("Значение угла в градусах %.4f",result);
    }
}
