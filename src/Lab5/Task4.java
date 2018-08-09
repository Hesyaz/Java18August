package Lab5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a;
        Scanner s;
        s = new Scanner(System.in);
        a= s.nextInt();
        if (a<0) {
            a = a * (-1);
        }
            System.out.printf("%d",a);
        }
    }

