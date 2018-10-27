package Lab7;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String numbers = s.nextLine();

        int count = 0;
        int sum =0;
        double avg =0;
        String[] num = numbers.split(" ");
        int[] a = new int[num.length];

        for(int i = 0; i < num.length; i++){
            a[i] = Integer.parseInt(num[i]);
            sum += a[i];
            count++;
            avg= sum/count;
        }
        //System.out.println(sum);
        // System.out.println(count);
        System.out.println( avg);


    }
}
