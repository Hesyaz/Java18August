package Lab5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int k;
        double result;
        Scanner s;
        s = new Scanner(System.in);
        k = s.nextInt();
        if(k>0){
            result= Math.sqrt(k);
        }
        else{
            result=k*k;
        }
        System.out.printf("%.1f",result);

    }
}
