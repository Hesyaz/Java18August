package Lab6;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int x;
        x=s.nextInt();

        while(a<=x){
            System.out.printf("%d  - %d\n ", a,b);
            a++;b++;
         if(b==4){
             b=0;}
            //a++;b++;
        }
        if(x<0){
            System.out.println("Значение N должно быть неотрицательным");
        }

    }
}
