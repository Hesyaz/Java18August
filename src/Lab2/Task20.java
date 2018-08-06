package Lab2;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {

    int x;
    int y;
    double result;
    Scanner s;
    s = new Scanner(System.in);
    x = s.nextInt();
    y = s.nextInt();
    if (y<=0){
        System.out.println("Значение у должно быть неотрицательным");
        return;
    }
    if  ((Math.sqrt(x+ Math.sqrt(y)))<=0){
        System.out.println("Подкоренное выражение должно быть неотрицательным");
        return;
    }
    result = ((-5)*Math.sqrt(x + Math.sqrt(y)));
        System.out.println(result);
}}
