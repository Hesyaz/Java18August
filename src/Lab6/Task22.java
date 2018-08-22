package Lab6;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        int x;
        Scanner s;
        s = new Scanner(System.in);
        x = s.nextInt();
        int num = 10;
         do{
             //1
             System.out.print(num);
             if(num==x){
                 System.out.print(  "+");
             }
             System.out.println();
             num++;
         }
         while(num<=20);



    }
}
