package Lab2;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        double mass,aDeg,aRad,force,g;
        g = 9.8067;
        Scanner s;
        s = new Scanner(System.in);
        mass = s.nextDouble();
        aDeg= s.nextDouble();
        aRad= aDeg*(Math.PI)/180;

        if(mass<=0){
            System.out.println("Масса должна быть положительной");
        }
        if (aDeg >=90){
            force = 0;
            System.out.println(force);
            return;
        }
        force = mass*g*Math.cos(aRad);
        System.out.println(force);


    }
}
