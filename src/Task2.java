import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Объявление переменной
        String a;// Переменная для хранения вводимой строки

        Scanner s; //Переменнвая для сканера
        s = new Scanner(System.in);//Создание сканера для чтения из консоли
        a = s.nextLine();//Чтение из консоли сохраняем в а
        System.out.println("Мы стремимся к "+ a);
    }

}

