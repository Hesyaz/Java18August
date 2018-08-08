package Lab2;

import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {
        double Xa,Ya,Xb,Yb,result;
        Scanner s;
        s = new Scanner(System.in);
        Xa= s.nextDouble();
        Ya=s.nextDouble();
        Xb=s.nextDouble();
        Yb=s.nextDouble();

        result =Math.sqrt(((Xb-Xa)*(Xb-Xa))+ ((Yb-Ya)*(Yb-Ya)));
        System.out.printf("Расстояние между двумя точками равно %.4f",result);

    }
}
