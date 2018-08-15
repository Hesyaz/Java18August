package Lab6;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int B,sum;
        Scanner s;
        s = new Scanner(System.in);
        B = s.nextInt();
        sum=0;
        if(B>10000){
            System.out.println("Значение b должно быть в интервале [-10,10000]");
            return;
        }
        if(B<-10){
            System.out.println("Значение b должно быть в интервале [-10,10000]");
            return;
        }
        while(B>=-10){
            sum= sum + B;
            B--;
        }
        System.out.println(sum);
    }
}
