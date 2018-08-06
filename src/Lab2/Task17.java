package Lab2;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int x;
        double result;
        Scanner s;
        s = new Scanner (System.in);
        x = s.nextInt();
        if (x<=0){
            System.out.println("Значение Х должно быть неотрицательным");
            return;
        }
        result = Math.sqrt(x);
        System.out.printf("%.4f", result);
    }
}
