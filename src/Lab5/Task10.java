package Lab5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        double x,y,z,x2,y2,z2;
        Scanner s;
        s = new Scanner(System.in);
        x = s.nextDouble();
        y =s.nextDouble();
        z =s.nextDouble();

        if(x > 0) {
            x2=x*x;
            System.out.print(x2+ " ");
        }
        else {
            System.out.print(x + " ");
        }
        if(y > 0) {
            y2=y*y;
            System.out.print(y2+ " ");
        }
        else {
            System.out.println(y + " ");
        }
        if(z > 0) {
            z2=z*z;
            System.out.println(z2);
        }
        else {
            System.out.println(z);
        }

    }

}
