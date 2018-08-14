package Lab5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double radius,edge, areaCube,areaCirc;
        Scanner s;
        s= new Scanner(System.in);
        radius= s.nextDouble();
        edge=s.nextDouble();
        areaCube= edge*edge;
        areaCirc= radius*radius*Math.PI;
        if (areaCirc>areaCube){
            System.out.printf("Площадь круга %.2f больше площади квадрата %.2f",areaCirc,areaCube);
        }
        if(areaCube>areaCirc){
            System.out.printf("Площадь квадрата %.2f больше площади круга %.2f",areaCube,areaCirc);
        }
        if(radius<0){
            System.out.println("Радиус должен быть положительным");
        }
        if(edge<0){
            System.out.println("Сторона квадрата должна быть положительна");
        }

    }
}
