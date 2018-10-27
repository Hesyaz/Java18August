package Lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String top = s.nextLine();
        String left = s.nextLine();
        if(top.isEmpty()){
            System.out.println("Данные сверху отсутствуют");
            return;}

        if(left.isEmpty()){
            System.out.println("Данные слева отсутствуют");
            return;}

        String[] top1 = top.split(" ");
        String[] left1 = left.split(" ");

        int counter = 0;

        List<String> matches = new ArrayList<>();

        for (int i = 0; i < top1.length; i++) {
            for (int j = 0; j < left1.length; j++) {
                if (top1[i].equals(left1[j])) {
                    matches.add(top1[i]);
                    counter++;
                }
            }
        }

        System.out.println(counter);

        matches.forEach(System.out::print);
    }
}
