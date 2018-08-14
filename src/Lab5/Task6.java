package Lab5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s;
        double shipKmH,cometMS,shipMS;
        s = new Scanner(System.in);
        shipKmH= s.nextDouble();
        cometMS=s.nextDouble();
        shipMS= (shipKmH *1000)/3600;
        if(shipKmH<0){
            System.out.println("Скорость корабля должна быть неотрицательна");

        }
        if(cometMS<0){
            System.out.println("Скорость кометы должна быть неотрицательна");

        }
        if(cometMS>shipMS){
            System.out.printf("Комета улетит от корабля. Скорость корабля %.2f км/ч меньше скорости кометы %.2f м/с",shipKmH,cometMS);
        }
        else{
            System.out.printf("Корабль догонит комету. Скорость кометы %.2f м/с меньше скорости корабля %.2f км/ч",cometMS,shipKmH);
        }

    }
}
