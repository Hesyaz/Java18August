package Lab6;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int A,B,C;
        Scanner s;
        s = new Scanner(System.in);
        A = s.nextInt();
        B =s.nextInt();
        C=A;
        //System.out.printf("%d %d\n",A,B);
        //A++;B--;
        //System.out.printf("%d %d\n",A,B);
        //A++;B--;
        //System.out.printf("%d %d\n",A,B);
        //A++;B--;

        if (A<B){
        while(C<=B){
            System.out.printf("%d %d\n",A,B);
            A++;B--;
        }}
        else{
            while(C>=B){
            System.out.printf("%d %d\n",A,B);
            A--;B++;}
        }



        /*
        while(A<=B){
            System.out.println(A);
            A++;
        }

        while(A>=B){
            System.out.println(A);
            A--;
        }*/
    }
}
