package Lab7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();

        if (data.isEmpty()) {
            System.out.println("Исходная строка ввода");
            return;
        }
        String[] arr = data.split(" ");

        int last;
        last = arr.length - 1;//индекс последнего элемента

        String t;
        t = arr[last];// значение помледнего элемента переносим в переменную т

        while (last > 0) {// пока последний элемент больше 0 . Знаечние предроследнего элемента присвоим значению помледнего элемента
            arr[last] = arr[last - 1];
            last--;
        }

        arr[0] = t;// значение , которое хранится в переменнгой т поставим в начало массива

        int count = 0;// вывод массива
        while (count < arr.length) {
            System.out.print(arr[count]);
            count++;
        }
    }
}
