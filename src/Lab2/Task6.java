package Lab2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int a;
        Scanner s;
        s = new Scanner(System.in);
        a = s.nextInt();
        int result = ((12*a*a) + (7*a) - 16);
        System.out.println("Значение функции " + result);

    }
}
