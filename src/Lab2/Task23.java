package Lab2;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        int lengthSeconds,hours,minutes,seconds;
        Scanner s;

        s= new Scanner (System.in);
        lengthSeconds = s.nextInt();

        if (lengthSeconds<=0){
            System.out.println("Количество времени должно быть неотрицательным");
            return;
        }

        hours = ((lengthSeconds/60)/60);
        System.out.print(hours +" "+"часов ");

        int lengthSeconds2;// объявление пременной количество секунд оставшихся после учета часа
        lengthSeconds2 = lengthSeconds - (hours*60*60);//количество секунд оставшихся после учета часа
                                                       // вычли количество секунд равное количеству часов

        minutes = lengthSeconds2/60;// количество минут
        System.out.print(minutes +" "+ "минут ");

        seconds= lengthSeconds2 - (minutes*60);//количество оставшихся секунд
        System.out.print(seconds +" "+ "секунд ");

    }
}
