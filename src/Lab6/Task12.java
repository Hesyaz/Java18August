package Lab6;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        //Найти сумму всех целых чисел от A до 500 включительно (значение А вводится -100<=A<=500)
        int A,sum;
        Scanner s;
        s = new Scanner(System.in);
        A = s.nextInt();
        sum = 0;

        if(A>500 ){
            System.out.println("Значение A должно быть в интервале [-100, 500]");
            return;
        }
        if(A<-100 ){
            System.out.println("Значение A должно быть в интервале [-100, 500]");
            return;
        }

         while(A<=500) {
             sum= sum+A;
             A++;
         }
        System.out.println(sum);

    }
}
