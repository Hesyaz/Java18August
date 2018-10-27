package Lab7;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String numbers1 = s.nextLine();

        String[] numbers = numbers1.split(" ");
        int[] num = new int[numbers.length];

        int a = 0;
        for (int i = 1; i < num.length; i++) {
            num[i] = Integer.parseInt(numbers[i]);
            if (num[i] < num[i - 1]) {
                a = num[i];
            } else {
                a = num[i - 1];
            }
        }
       // System.out.println(a);
        int b;
        for (int i = 0; i < num.length; i++) {
           b = num[i]- a;
            System.out.print(b);
        }
    }
}
