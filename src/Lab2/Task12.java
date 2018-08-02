package Lab2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int edge;
        Scanner s;
        s = new Scanner(System.in);
        edge= s.nextInt();
        if(edge<=0){// если значение ребра отрицательно или равно 0
            System.out.println("Значение edge должно быть положительным");// сообщение об ошибке
            return;// прекращение работы программы
        }
        int result = 6*edge*edge;// если значение ребора положительное
        System.out.println(result);
    }
}
