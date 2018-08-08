package Lab2;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        double x,result,up,down;
        Scanner s;
        s = new Scanner(System.in);
        x = s.nextDouble();

        up = (Math.sqrt(x+5) + Math.sqrt(x-5));
        down = 2*Math.sqrt(x);
        if(x==0){
            System.out.println("Подкоренное выражение должно быть неотрицательным\n");
            return;
        }
        if((x-5)<=0){
            System.out.println("Подкоренное выражение должно быть неотрицательным\n");
            return;
        }
        if ((x+5)<=0){
            System.out.println("Подкоренное выражение должно быть неотрицательным\n");
            return;
        }
        result = up/down;
        System.out.printf("%.4f",result);

    }
}
