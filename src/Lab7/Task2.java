package Lab7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String data= s.nextLine();
        if(data.isEmpty()){
            System.out.println("Исходная строка ввода");
            return;
        }
         String arr[]= data.split(" ");
        int count=0;
        while(count<arr.length){
            System.out.println(arr[count] + " " + count);
            count++;

        }


    }

}
