package Lab5;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner s;
        s= new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        if( x>y && x>z){
            System.out.println(x);
        }
        else if(y>x && y>z){
            System.out.println(y);
        }
        else if(z>y && z>x ){
            System.out.println(z);
        }
    }
}
