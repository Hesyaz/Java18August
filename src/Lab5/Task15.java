package Lab5;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        double x,y,z;
        Scanner s;
        s = new Scanner (System.in);
        x = s.nextDouble();
        y =s.nextDouble();
        z =s.nextDouble();
        if(x > -3 && x < 5){
            System.out.println(x);
        }
        if(y > -3 && y < 5){
            System.out.println(y);
        }
        if(z > -3 && z < 5){
            System.out.println(z);
        }
        
    }
}
