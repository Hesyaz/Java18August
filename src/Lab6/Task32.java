package Lab6;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w;
        w = s.nextInt();
        if (w < 0 || w > 20) {
            System.out.println("Значение W должно быть в интервале [0, 20]");
            return;
        }
        for (int i = 0; i < w; i++) {
            System.out.print("a");
        }
        System.out.println();
        for (int i = 0; i < w; i++) {
            System.out.print("b");
        }
        System.out.println();

        for (int i = 0; i < w; i++) {
            System.out.print("c");
        }
        System.out.println();

        for (int i = 0; i < w; i++) {
            System.out.print("d");
        }
        System.out.println();

        for (int i = 0; i < w; i++) {
            System.out.print("e");
        }
        System.out.println();
        for (int i = 0; i < w; i++) {
            System.out.print("f");
        }
        System.out.println();
        for (int i = 0; i < w; i++) {
            System.out.print("g");
        }
        System.out.println();
        for (int i = 0; i < w; i++) {
            System.out.print("h");
        }
        System.out.println();

    }
}
