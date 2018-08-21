package Lab6;

import java.util.Scanner;

public class Task20_19 {
    public static void main(String[] args) {
        int a, sum, count;
        Scanner s;
        s = new Scanner(System.in);
        sum = 0;
        count = 0;
        do {
            a = s.nextInt();
            sum = sum + a;
            count++;

        }
        while(sum<=1000);
        System.out.println(count);
    }
}
