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

        if(totalM<=0){
            System.out.println("Длина рулона должна быть положительна");
            return;
        }

        if(totalCm < partCm){
            System.out.println("Материала не хватит даже на одно изделие");
            return;
        }
        if(partCm<=0){
            System.out.println("Расход материала должен быть положительным");
            return;
        }

        result1 = totalCm/ partCm;
        result2= totalCm% partCm;
        System.out.printf("%d шт ",result1);
        System.out.printf( "%d",result2);

    }
}
