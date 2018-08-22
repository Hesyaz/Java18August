package Lab6;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        int n;// сколько нужно
        int a =0;//уже
        n = s.nextInt();
        while (a<n){
            System.out.print("#");
            a++;
            if(a==20){
                System.out.println();
            }
        }


    }
}
