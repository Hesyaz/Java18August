package Lab2;
import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        double initialVelocity ,time , acceleration, distance;
        Scanner s;
        s = new Scanner(System.in);
        initialVelocity = s.nextDouble();
        time = s.nextDouble();
        acceleration = s.nextDouble();

        if (time<=0){
            System.out.println("Время должно быть положительным");
            return;
        }
        if(initialVelocity<=0){
            System.out.printf("Начальная скорость должна быть неотрицательна");
            return;
        }
        distance= initialVelocity * time + ((acceleration * time * time)/2);
        System.out.printf("Результат %.4f",distance);
    }
}
