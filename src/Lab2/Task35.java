package Lab2;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {

        double a,b,c,x,result;

        Scanner s;
        s= new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        x = s.nextDouble();

        if((Math.sqrt((a*x*x)+(b*x)+c))== 0) {
            System.out.println("Знаменатель не может быть равен нулю");
            return;
        }

       if(((a*x*x)+(b*x)+c)<=0){
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;
        }


        result = (1/(Math.sqrt((a*x*x)+(b*x)+c)));
        System.out.printf("%.4f",result);
    }
}
