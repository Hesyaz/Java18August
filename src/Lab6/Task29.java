package Lab6;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {


    Scanner s;
    s = new Scanner(System.in);
    int a,b,product;
    a = s.nextInt();
    b = s.nextInt();
    long sum=0;

        if(a<=b)
            while (a<=b){
          if(a%7==0){
              sum=sum+a;
          }
          a++;
    }
            else{
        while(b<=a){
           if(b%7==0){
               sum=sum+b;
           }
           b++;

        }
    }
        System.out.println(sum);
}}
