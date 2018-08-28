package Lab7;

public class EXample {
    public static void main(String[] args) {
        String [] a;// Объявление массива строк
        a= new String[5];// Инициализация массива длиной 5
        a[0]="a";// Инициализация элемента массива
        a[1]="b";
        a[2]="c";
        a[3]="d";
        a[4]="e";//последний элемент
        System.out.println(a[0]);//образнеиние к элементу массива

        a= new String[] {"a","s","w"}; // не задаем размер массива
        System.out.println(a.length);//Вывод длинны массива

        a= "qw;er;ty;".split(";");
        a= new String [] {"qw","er","ty"}; // same thing as the one above
        System.out.println(a[99]);
//        Exception in thread "main" a
//        3
//        java.lang.ArrayIndexOutOfBoundsException: 99
//        at Lab7.EXample.main(EXample.java:19)


    }
}
