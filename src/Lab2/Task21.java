package Lab2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        int totalM,partCm;
        int totalCm;
        int result1,result2;

        Scanner s;
        s = new Scanner(System.in);
        totalM = s.nextInt();
        partCm = s.nextInt();
        totalCm = totalM* 100;
        result1 = totalCm/ partCm;
        result2= totalCm% partCm;
        System.out.printf("%f шт ",result1);
        System.out.printf( "%f",result2);

    }
}
