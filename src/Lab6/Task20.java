package Lab6;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {

        int a,sum,count;
        Scanner s;
        s = new Scanner(System.in);
        a = s.nextInt();
        sum=0;
        sum = sum + a;
        count = 1;
        while(sum<=1000){
            a = s.nextInt();
            sum = sum+a;
            //System.out.println(count);
            count++;
        }
        System.out.println(count);
    }
}
