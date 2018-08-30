package Lab7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        if (data.isEmpty()) {
            System.out.println("Исходная строка ввода");
            return;
        }
        String[] arr = data.split(" ");// делим на части ориентируясь на пробел
        int n;
        n = arr.length-1;
        while(n>=0){
            System.out.print(arr[n]);
            n--;

        }
    }}

