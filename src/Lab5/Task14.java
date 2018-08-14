package Lab5;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        double leftA,leftB,rightA,rightB;
        Scanner s;
        s = new Scanner(System.in);
        leftA=s.nextDouble();
        leftB=s.nextDouble();
        rightA=s.nextDouble();
        rightB= s.nextDouble();
        if(leftA>leftB && rightA>rightB){
            System.out.println("Значение A должно быть меньше значения B");
        }
    }}

