package Lab6;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        int a,sum,count;
        Scanner s;
        s = new Scanner(System.in);
        a = s.nextInt();
        sum = 0;
        sum = sum + a;
        count = 1;
        while(a!=0){
             a=s.nextInt();
             sum=sum + a;
             count++;
        }
         System.out.println(sum);
         System.out.println(count);
    }
}

