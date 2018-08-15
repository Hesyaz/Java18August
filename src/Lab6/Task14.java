package Lab6;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int A,B,sum;
        Scanner s;
        s = new Scanner(System.in);
        A = s.nextInt();
        B = s.nextInt();

        sum = 0;


        while(A<B){
            sum =sum + A;
            A++;
          //  System.out.println(sum);
        }
        while(A>=B){
            sum = sum + A;
            A--;
           // System.out.println(sum);
        }
        System.out.println(sum);
    }

}
