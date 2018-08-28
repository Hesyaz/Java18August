package Lab7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        String data = s.nextLine();
        int a = s.nextInt();
        if(data.isEmpty()){
            System.out.println("Исходная строка ввода");
            return;

        }
        String[] arr = data.split(" ");// делим на части ориентируясь на пробел
        if(a<0 || arr.length<a){
            System.out.println("Число A должно быть в интервале [0, размер массива)");
            return;
        }
        System.out.println(arr[a]);
    }



}
