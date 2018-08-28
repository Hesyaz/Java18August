package Lab6;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Значение W должно быть в интервале [0, 20]");
            return;
        }
//        for (int i = 0; i < n; i++) {
//            for (int a = 0; a <= 9; a++) {
//                System.out.print(a);
//            }
//            System.out.println();
//        }
        int count=0;
        for(int a=0;a<=9;a++){
            int i=0;
            while( i<n){
                System.out.print(count);
                i++;
            }
            System.out.println();
            count++;
        }
    }
}
