package Lab6;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=0;// uzhe
        int b; // nuzhno
        b = s.nextInt();
         while(a<b){
             System.out.print("!");
             a++;
             if(a%5==0){//кратно 5

                 System.out.print(" ");
             }
         }
         if(b<0){
             System.out.println("Значение b должно быть неотрицательным");
         }




    }
}
