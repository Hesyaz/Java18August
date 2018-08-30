package Lab7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int a = s.nextInt();
        if (data.isEmpty()) {
            System.out.println("Исходная строка ввода");
            return;
        }
        String[] arr = data.split(" ");

        int last = arr.length - 1;// индекс последнего элемента массива

        for (int i = 0; i <= a; i++) {
            String t = arr[last];

            while (last > 0) {
                arr[last] = arr[last - 1];
                last--;
            }
            arr[0] = t;
            int count = 0;// вывод массива
            while (count < arr.length) {
                System.out.print(arr[count]);
                count++;
            }
            System.out.println();
        }

    }
}
