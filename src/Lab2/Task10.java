package Lab2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        double aDeg,bDeg;
        double  result;
        Scanner s;
        s = new Scanner (System.in);
        aDeg =  s.nextDouble();
        bDeg =  s.nextDouble();

        double aRad= aDeg*(Math.PI)/180;
        double bRad= bDeg*(Math.PI)/180;
         result = Math.sin(aRad)*Math.cos(bRad)+ Math.cos(aRad)* Math.sin(bRad);
        System.out.printf("Значеник угла указано в градусах %.4f",result);



    }
}
