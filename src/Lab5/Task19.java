package Lab5;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        int a,hundreds,units;
        Scanner s;
        s = new Scanner(System.in);
        a =s.nextInt();
        if ( a<1000 && a>9999){
            System.out.println("Значение A должно быть в интервале [1000, 9999]");
        }
        hundreds = a /100;
        units= a % 10;
        System.out.println(hundreds);
        System.out.println(units);
    }
}
