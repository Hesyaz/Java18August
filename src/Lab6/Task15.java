package Lab6;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int A,B,product;
        Scanner s;
        s = new Scanner(System.in);
        A = s.nextInt();
        B = s.nextInt();

        product = 1;


        while(A<B){
            product =product * A;
            A++;
        }
        while(A>=B){
            product = product * A;
            A--;
            // System.out.println(sum);
        }
        System.out.println(product);
    }

}

