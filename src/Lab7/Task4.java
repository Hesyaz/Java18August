package Lab7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int b = s.nextInt();
        int e = s.nextInt();

        if (data.isEmpty()) {
            System.out.println("Исходная строка ввода");
            return;
        }
        String[] arr = data.split(" ");// делим на части ориентируясь на пробел

        if (b <= e) {
            while (b <= e) {
                System.out.print(arr[b] + " ");
                b++;
            }
        } else {
            while (b >= e) {
                System.out.print(arr[e] + " ");
                e++;
            }
        }


    }


}




