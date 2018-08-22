package Lab6;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        int y;
        y = s.nextInt();
        int i=0;
        int d =0;
        while(i<=y){
            System.out.print("#");
            i++;
        }
        int x = 15-y;
        while(d<x){
            System.out.print(".");
            d++;
        }
       // int n = 15;
//        if(y<0 || y>15){
//            System.out.println("Значение Y должно быть в интервале [0, 15]");
//            return;
       // }

//        while(n<=15){
//            System.out.print(".\n");
//            n++;
//        }




    }
}
