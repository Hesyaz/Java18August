package Lab5;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        int M,P;
        int result;
        Scanner s;
        s = new Scanner(System.in);
        M = s.nextInt();
        P = s.nextInt();

        result =M/P;
        if(result==(M/P)){
        System.out.println(result);
    }
    else{
            System.out.println("M не делится нацело на P");
        }
}}
