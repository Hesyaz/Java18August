package Lab2;

import java.util.Scanner;

public class Task13_2  {
    public static void main(String[] args) {


    double edge;
    double height;
    double area;

    Scanner s;
    s = new Scanner(System.in);
    edge= s.nextDouble();
    height = s.nextDouble();

    boolean errorFound;
    errorFound = false;

    if (edge <=0) {
        System.out.println("Длина основания треугольника должна быть положительна");
        errorFound= true;
    }
    if (height <=0) {
        System.out.println("Высота треугольника должна быть положительн");
        errorFound=true;
    }
    if(errorFound==true){
        return;
    }
    area = edge*height/2;
    System.out.println(area);




}
}
