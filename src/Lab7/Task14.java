package Lab7;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();

        String[] xx = x.split(" ");

        for (int i = 1; i <= xx.length; i++) {

            if(xx[i].equals(xx[i-1]))
                System.out.println("Повторения есть");
                else{
                    System.out.print("Повторения no");
                }
            }
        }
    }

