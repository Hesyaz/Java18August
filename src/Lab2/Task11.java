package Lab2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        double aDeg,bDeg;
        double  result;
        Scanner s;
        s = new Scanner (System.in);
        aDeg =  s.nextDouble();
        bDeg =  s.nextDouble();

        double aRad= aDeg*(Math.PI)/180;
        double bRad= bDeg*(Math.PI)/180;
        result= 3*Math.sin(2*aRad)* Math.cos(3*bRad);
        System.out.printf("Значеник угла указано в градусах %.4f" , result);
    }
}
