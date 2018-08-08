package Lab2;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        double x1,x2,result;
        Scanner s;
        s = new Scanner(System.in) ;
        x1 = s.nextDouble();
        x2 = s.nextDouble();

        result=Math.sqrt((x2*x2)+(x1*x1));
        System.out.printf("%.4f",result);
    }
}
