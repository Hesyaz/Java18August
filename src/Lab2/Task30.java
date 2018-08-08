package Lab2;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        double a,b,c,result;
        Scanner s;
        s= new Scanner(System.in);
        a= s.nextDouble();
        b=s.nextDouble();
        c=s.nextDouble();
        if ( a ==0){
            System.out.println("Уравнение  не является квадратным");
            return;
        }
        result= ((b*b)-(4*a*c));
        System.out.printf("Значение дисриминанта %.4f",result);
    }
}
