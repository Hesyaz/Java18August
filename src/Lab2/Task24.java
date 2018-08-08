package Lab2;
import java.util.Scanner;
public class Task24 {
    public static void main(String[] args) {

        double temperatureC, temperatureF;
        Scanner s;

        s = new Scanner(System.in);
        temperatureC= s.nextDouble();

        if( temperatureC<= -273.15){
            System.out.println("Температура должна быть выше абсолютного нуля");
            return;
        }
        temperatureF=(temperatureC*1.8) +32;
        System.out.printf("Значение температуры по шкале Фаренгейта %.4f",temperatureF);


    }
}
