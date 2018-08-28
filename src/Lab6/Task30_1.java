package Lab6;

import java.util.Scanner;

public class Task30_1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x;
        x=s.nextInt();
        if(x<=0){
            System.out.println("Значение X должно быть положительным");
            return;
        }
        for (int a =1;a<=x;a++){
            if(x%a==0){
                System.out.print(a + " ");
            }

        }

    }
}
