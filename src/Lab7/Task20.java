package Lab7;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String numbers = s.nextLine();
        int b = s.nextInt();

        String[] num = numbers.split(" ");
        int[] num1 = new int[num.length];

        int count = 0;

        for (int i = 0; i < num1.length; i++) {
            num1[i] = Integer.parseInt(num[i]);

            if (num1[i] < num1[b]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
