package Lab6;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x;
        int a=1;
        x = s.nextInt();
        if(x<=0){
            System.out.println("Значение X должно быть положительным");
            return;
        }
        while(a<=x){
            if(x%a==0){
                System.out.print(a+" ");
            }
            a++;
        }
    }
}
