package Lab5;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s;
        s = new Scanner(System.in);
        a =s.nextInt();
        b =s.nextInt();
        c =s.nextInt();
        if(a==b || b==c ||a==c){
            System.out.println("Треугольник является равнобедренным.\n");
        }
        else{
            System.out.println("Треугольник не является равнобедренным.");

        }
        if(a<0){
            System.out.println("Значение A должно быть неотрицательным\n");
        }
        if(b<0){
            System.out.println("Значение B должно быть неотрицательным");
        }
        if(c<0){
            System.out.println("Значение C должно быть неотрицательным");
        }
    }
}
