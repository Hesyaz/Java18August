import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Объявление переменной
        String a;

        //Объявление пременной для сканнера
        Scanner scan;

        //Создание сканера для чтения из консоли
        scan = new Scanner(System.in);

        //считываем следующую строку из консоли
        a = scan.nextLine();
        //Выводим данные переменной а считанные сканером + значение строки
        System.out.println(a + " нас не остановят!");
    }

}
