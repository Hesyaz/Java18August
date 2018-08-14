package Lab5;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
    double a,b,c,d;
    Scanner s;
    s= new Scanner(System.in);
    a= s.nextDouble();
    b=s.nextDouble();
    c=s.nextDouble();
    d= (b*b)- 4*a*c;

        if( a==0){
            System.out.println("Уравнение не является квадратным");
            return;
        }
    if (d<0){
        System.out.println("Уравнение не имеет вещественных корней");
    }
    else if(d==0){
        System.out.println("Уравнение имеет 1 вещественный корень");
    }
     else if (d>0){
        System.out.println("Уравнение имеет 2 вещественных корня");
    }

    }
}
