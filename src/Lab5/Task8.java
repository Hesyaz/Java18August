package Lab5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        double areaCircle,areaSquare,diameter,radius,edge;
        Scanner s;
        s = new Scanner(System.in);
        areaCircle = s.nextDouble();
        areaSquare= s.nextDouble();
        radius =Math.sqrt(areaCircle/Math.PI);
        diameter = 2*radius;
        edge = Math.sqrt(areaSquare);

        if(areaCircle<0){
            System.out.println("Площадь круга должна быть положительной");
        }
        if(areaSquare<0){
            System.out.println("Площадь квадрата должна быть положительной");
        }
        if(diameter<edge){
            System.out.println("Круг уместится в квадрате");
        }
        else{
            System.out.println("Круг не поместится в квадрате");
        }


    }
}
