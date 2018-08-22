package Lab6;

import java.util.Scanner;

public class task20_r {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        int a,count1,count2;
        count1=0;
        count2=0;

         do {
             a = s.nextInt();
             if( a > 83 && a < 199){
                 //System.out.printf("Число находиьтся в промежутке 83-199\n");
             }
             else if( a<83){
                 count1++;
             }else {count2++;}


         } while ( a<83 || a>199);
        System.out.printf("Количество слева: %d, количество справа: %d",count1,count2);

        }
    }

