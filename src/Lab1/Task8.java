package Lab1;

import java.util.Scanner;

public class Task8 {


    public static void main(String[] args) {
        String x;
        String y;
        Scanner s;

        s= new Scanner(System.in);
        x = s.nextLine();
        y= s.nextLine();
        System.out.println("INSERT INTO points (x, y) VALUES ('" + x +"', '" + y +"')");

    }
}
