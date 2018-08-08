package Lab2;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        double a,b,cInDeg,cInRad,result;
        Scanner s;
        s = new Scanner(System.in);
        a =s.nextDouble();
        b= s.nextDouble();
        cInDeg = s.nextDouble();

        cInRad= cInDeg*(Math.PI)/180;
        result = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(cInRad));
        System.out.println(result);
    }
}
