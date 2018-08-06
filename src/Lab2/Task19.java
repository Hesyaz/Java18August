package Lab2;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        int a;
        int b;
        double result;
        Scanner s;
        s= new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        if (b>= 0){
            System.out.println("Значение b должно быть не положительным");
            return;
        }
        result = a* Math.sqrt(-7*b);
        System.out.println(result);
    }
}
