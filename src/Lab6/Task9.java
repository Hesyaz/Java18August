package Lab6;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int V,result;
        Scanner s;
        s = new Scanner(System.in);
        V = s.nextInt();
        int i =1;
        while (i<=9){
            result = i*V;
            System.out.printf(" %d x %d = %d\n",i,V,result);
            i++;
        }
    }
}
