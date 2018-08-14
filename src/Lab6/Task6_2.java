package Lab6;

import java.util.Scanner;

public class Task6_2 {
    public static void main(String[] args) {

        int a,b,end,start;
        Scanner s;
        s= new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        if(a<b){
            start = a;
            end=b;
        }
        else{
            start=b;
            end=a;
        }
        while(start<=end){
            System.out.println(start+ " ");
            start++;
        }
   }
}
