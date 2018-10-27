package Lab7;

import java.util.Scanner;

public class Task11_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int x;
        x = s.nextInt();

        String[] arr = data.split(" ");
        int[] num = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
            if (arr[i].equals(x)) {

                System.out.print(arr[i] + "+");
            }

        }
    }
}

