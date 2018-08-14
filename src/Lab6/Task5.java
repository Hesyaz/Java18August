package Lab6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int A;
        String B;
        Scanner s;
        s = new Scanner(System.in);
        B=s.nextLine();
        A=s.nextInt();


        if(A<0){
            System.out.println("Значение A должно быть неотрицательным\n");
            return;
        }
        System.out.print("\"");

        int i=0;
        while(i<=A){
            System.out.print(B);
            i++;
        }
        System.out.println("\"");
    }
}
