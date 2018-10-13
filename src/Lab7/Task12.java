package Lab7;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String top = s.nextLine();
        String left = s.nextLine();
        if (top.isEmpty()) {
            System.out.println("Данные сверху отсутствуют");
            return;
        }
        if (left.isEmpty()) {
            System.out.println("Данные слева отсутствуют");
            return;
        }
        String[] top1 = top.split(" ");
        String[] left1 = left.split(" ");

        int[] numtop = new int[top1.length];
        int[] numleft = new int[left1.length];

        for (int i = 0; i < top1.length; i++) {
            numtop[i] = Integer.parseInt(left1[i]);
            numleft[i] = Integer.parseInt(top1[i]);
            System.out.print(numleft[i] * numtop[i] + " ");
        }


    }
}
