package Lab7;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String top = s.nextLine();
        String left = s.nextLine();
        if (top.isEmpty()) {
            System.out.println("Данные сверху отсутствуют");
            return;
        }
        if (left.isEmpty()) {
            System.out.println("Данные слева отсутствуют");
            return;
        }
        String[] top1 = top.split(" ");
        String[] left1 = left.split(" ");

        for(int i=0;i<top1.length;i++){
            for(int j=0;j<left1.length;j++){
                if(top1[i]==left1[j]){
                    System.out.println("Элементы в массивах равны" + top1[i]);
                }
            }
        }

       // System.out.println(Arrays.equals(top1,left1));



        }


    }

