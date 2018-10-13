package Lab7;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
       // int x = s.nextInt();

        int count = 9;

        while (count < 20) {
            count++;
            if (count % 2 != 0) {
                System.out.println(count);
            }
        }




        int num = 9;
        while (num < 20) {
            num++;
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }


    }
}


