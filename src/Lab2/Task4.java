package Lab2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int x1, x2, x3;
        Scanner s;
        s = new Scanner(System.in);
        x1 = s.nextInt();
        x2 = s.nextInt();
        x3 = s.nextInt();
        int result;
        result= x1*x2 + x1*x3 +x2*x3;
        System.out.println(result);
    }
}
