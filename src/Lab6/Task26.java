package Lab6;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num =30;
        int x=s.nextInt();
        do{
            System.out.print(num);
            if(num==x){
                System.out.print(  "+");
            }
            else{
                System.out.print("-");
            }
            System.out.println();
            num++;
        }while(num<=40);


    }
}
