package Lab6;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S;
        int w, h;
        S = s.nextLine();
        w = s.nextInt();
        h = s.nextInt();

        if(w<=0){
            System.out.println("Значение W должно быть неотрицательно");
            return;
        }
        if(h<=0){
            System.out.println("Значение H должно быть неотрицательно");
            return;
        }


        for (int i = 0; i < h; i++) {
            for (int a = 0; a < w; a++) {
                System.out.print(S);
            }
            System.out.println();
        }
        //System.out.println();

    }
}
