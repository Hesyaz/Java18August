package Lab2;
 import java.util.Scanner;
public class Task27 {
    public static void main(String[] args) {

        double mass,velocity,height,kineticEnergy,potentialEnergy,g;
        g =9.8067;
        Scanner s;
        s = new Scanner(System.in);
        mass =s.nextDouble() ;
        velocity = s.nextDouble();
        height = s.nextDouble();

        if(mass<=0){
            System.out.println("Значение mass должно быть положительным");
            return;
        }
        if(velocity<=0){
            System.out.println("Значение velocity должно быть положительным");
            return;
        }
       if (height<=0){
           System.out.println("Значение height должно быть неотрицательным");
           return;
       }
       kineticEnergy = (mass * velocity * velocity)/2;
       potentialEnergy = mass * g * height;
        System.out.println("Кинетическая энергия составляет:"+ kineticEnergy + "Дж\n");
        System.out.println("Потенциальная энергия составляет:"+ potentialEnergy + "Дж\n");


}}
