package Lab2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int edge;
        int volume;
        Scanner s;
        s = new Scanner(System.in);
        edge = s.nextInt();
         if (edge <= 0){
             System.out.println("Значение edge должно быть положительным");
             return;
         }
         volume = edge*edge*edge;
        System.out.println(volume);
    }

}
