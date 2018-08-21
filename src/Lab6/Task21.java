package Lab6;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
         int a,b,sum,product;
        a = s.nextInt();
        b = s.nextInt();
        sum=0;

        if(a<=b)
            while (a<=b){    //работает для а меньше б . но для б меньше а не работает
                product = a*a;
                a++;
                sum +=product;
            }
            else{
                while(b<=a){
                    product =a*a;
                    a--;
                    sum+= product;

                }
        }
        System.out.println(sum);
        /*
            do{ product  = a * a;
               a++;
               sum += product;
        }
        while(a<=b);
        System.out.println(sum);


      do{ product  = b * b;
            b++;
            sum += product;
        }
        while(b<=a);
        System.out.println(sum);
    }*/
}}
