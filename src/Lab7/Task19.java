package Lab7;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String left = s.nextLine();
        String right = s.nextLine();

        String[] left1 = left.split(" ");
        String[] right1 = right.split(" ");

        int[] a = new int[left1.length];
        int[] b = new int[right1.length];


        for (int i = 0; i < left1.length; i++) {
            a[i] = Integer.parseInt(left1[i]);
                b[i] = Integer.parseInt(right1[i]);

                int result = a[i]*b[i];

                System.out.print(result + " ");
            }

        }


    }

