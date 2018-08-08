package Lab2;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        double xDeg,result,xRad;
        Scanner s;
        s = new Scanner(System.in);
        xDeg= s.nextDouble();

        xRad=xDeg*(Math.PI)/180;
        result = Math.sqrt(1- (Math.sin(xRad)*Math.sin(xRad)));
        System.out.printf("%.4f",result);
    }
}
