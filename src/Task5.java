import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
     /*   String a = "начало ";
        String b = "конец";
        System.out.println(a + b);*/
     String a;//объявление пременной а
     String b;// объявление пременной б
     Scanner s;//переменная для сканера

     s = new Scanner(System.in);// создание сканера
     a = s.nextLine();// чтение из кончоли сохраняем в а
     b = s.nextLine();// чтение из консоли сохраняем в б
        System.out.println(b +" "+ a);// вывод переменная б + переменная а


    }

}
