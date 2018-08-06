package Lab2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        int x;
        double result;
        Scanner s;
        s = new Scanner (System.in);
        x = s.nextInt();
        if ((61-x)<=0){
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;
        }
        result =  3* Math.sqrt(61-x);
        System.out.printf("%.4f", result);
    }
}

