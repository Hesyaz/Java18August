package Lab6;

import java.util.Scanner;

public class Task18_2 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        int a;
        int sum = 0;
        int count = 0;
        do {
            a = s.nextInt();
            sum = sum + a;
            count++;
        } while (a != 0);
        System.out.println(sum);
        System.out.println(count);

    }
}

