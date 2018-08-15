package Lab6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int A,B;
        Scanner s;
        s= new Scanner(System.in);
        A= s.nextInt();
        B=s.nextInt();
        if(A>B){
            System.out.println("Значение A должно быть не больше значения B");
            return;
        }

        while(B>=A){
            System.out.print(B + " ");
            B--;
        }
    }
}
