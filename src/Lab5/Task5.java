package Lab5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double roadKm,lengthFeet,lengthM,roadM;

        Scanner s;
        s = new Scanner(System.in);
        roadKm = s.nextDouble();
        lengthFeet = s.nextDouble();

        roadM= roadKm*1000;
        lengthM = lengthFeet * 0.305;

        if(roadM<0){
            System.out.println("Расстояние между деревнями должно быть неотрицательно");
        }
        if(lengthM<0){
            System.out.println("Длина кабеля должна быть неотрицательна");
        }

        if(lengthM >=roadM){
            System.out.println("Кабеля хватит. Расстояние меньше длины кабеля.");
        }
        else if (lengthM < roadM){
            System.out.println("Кабеля не хватит. Длина кабеля меньше расстояния.");
        }




    }
}
