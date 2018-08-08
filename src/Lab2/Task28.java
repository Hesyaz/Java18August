package Lab2;
import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        double r1,r2,result;
        Scanner s;
        s = new Scanner(System.in);
        r1 = s.nextDouble();
        r2 = s.nextDouble();
        if (r1==0){
            System.out.println("Значение r1 должно быть не равно нулю");
            return;
        }
         if (r2==0){
             System.out.println("Значение r2 должно быть не равно нулю");
             return;
         }
         result = 1/r1 + 1/r2;
        System.out.printf("%.4f",result);

    }
}
