package Lab6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int A,B,i;
        Scanner s;
        s = new Scanner(System.in);
        A = s.nextInt();
        B = s.nextInt();



        if (A<B){
            while(A<=B){
                System.out.print(A + " ");
               A++;}}


        else{
                while(B<=A){
                    System.out.print(B+ " ");
                    B++; }
    }
}}




