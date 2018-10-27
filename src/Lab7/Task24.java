package Lab7;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String numbers1 = s.nextLine();
        int x = s.nextInt();
        int y = s.nextInt();

        String[] numbers = numbers1.split(" ");
        int[] num = new int[numbers.length];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(numbers[i]);
            if (num[i] == x) {
                num[i] = y;
            }
            System.out.print(num[i]);
        }


    }
}
