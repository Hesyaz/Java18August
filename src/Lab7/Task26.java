package Lab7;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String numbers1 = s.nextLine();
        int k = s.nextInt();


        String[] numbers = numbers1.split(" ");
        int[] num = new int[numbers.length];

        int count =0;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(numbers[i]);
            if(num[i]==k){
                count++;
            }
        }
        System.out.println(count);
    }
}
