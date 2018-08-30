package Lab7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int p = s.nextInt();
        int q = s.nextInt();
        if (data.isEmpty()) {
            System.out.println("Исходная строка ввода");
            return;
        }
        String[] arr = data.split(" ");

        String t;
        t= arr[p];
        arr[p]=arr[q];
        arr[q]=t;

        int count = 0;
        while (count < arr.length) {
           System.out.print(arr[count]);
           count++;
      }


    }
}
