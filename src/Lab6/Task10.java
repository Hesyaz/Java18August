package Lab6;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int A,B;
        Scanner s;
        s = new Scanner(System.in);
        A = s.nextInt();
        B =s.nextInt();

        while(A<=B){
            System.out.println(A);
            A++;
        }

        while(A>=B){
            System.out.println(A);
            A--;
        }
    }
}
