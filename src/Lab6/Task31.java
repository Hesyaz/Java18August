package Lab6;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        int a=1;
        int count =0;
        x = s.nextInt();


        if(x<=0){
            System.out.println("Значение x должно быть положительным");
            return;
        }
        while (a <= x) {
            if (x % a == 0) {
                count++;
            }
            a++;
        }
        if(count==2){
            System.out.println("число простое");
        }
        else{
            System.out.println("число не простое");
        }
        System.out.println();
    }
}
