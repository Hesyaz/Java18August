import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        String name;
        String surname;
        Scanner s1;

        s1 = new Scanner(System.in);
        name = s1.nextLine();
        surname = s1.nextLine();
        System.out.println("Меня зовут" + " " + surname +"," + name + " "+ surname);


    }

}
