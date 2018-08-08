package Lab2;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        double a,b,c,d;
        double result;
        Scanner s;
        s = new Scanner(System.in);
        a = s.nextDouble();
        b =s.nextDouble();
        c= s.nextDouble();
        d = s.nextDouble();

        if (a==0){
            System.out.println("Значение a должно быть не равно нулю");
            return;
        }
        if(d==0){
            System.out.println("Значение d должно быть не равно нулю");
            return;
        }

        result = (((a*d)+(b*c))/(a*d));
        System.out.println(result);
    }
}
