package Lab6;

import java.util.Scanner;

public class task20_r {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        int a,count1,count2;
        a=s.nextInt();
        count1=0;
        count2=0;

         do {
             if (a < 83) {
                 while (a < 83) {
                     count1++;
                 }
             }
             if (a > 199) {
                 while (a > 199) {
                     count2++;
                 }
             }
         } while ( a<83 && a>199);
            System.out.println("Количество слева:"+count1);
            System.out.println("количество справа:"+count2);
        }
    }

