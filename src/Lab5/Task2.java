package Lab5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int p,q;
        Scanner s;
        s = new Scanner(System.in);
        p= s.nextInt();
        q=s.nextInt();
        if(p>q){
            System.out.printf("Максимальное %d Минимальное %d",p,q);
        }
        else{
            System.out.printf("Максимальное %d Минимальное %d",q,p);
        }
    }
}
