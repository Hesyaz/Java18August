package Lab2;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

        double velocity1,velocity2,total_velocity,distance;
        double time;

        Scanner s;
        s = new Scanner(System.in);
        velocity1 = s.nextDouble();
        velocity2 = s.nextDouble();
        distance = s.nextDouble();
        if (velocity1<=0){
            System.out.println("Скорость должна быть неотрицательнa");
            return;
        }
         if(velocity2<=0){
             System.out.println("Скорость должна быть неотрицательнa");
             return;
         }
         if(distance<=0){
             System.out.println("Расстояние должно быть неотрицательным");
             return;
         }
        total_velocity = velocity1+velocity2;
        time = distance / total_velocity;
        System.out.printf("Время,через которое два автомоюился встретятся %.4f",time);


    }
}
