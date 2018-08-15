package Lab6;

public class Task8 {
    public static void main(String[] args) {
        int A, B, pound;
        A = 1;
        pound = 453;
        while (A <= 20){
            System.out.println( A + "     " + pound );
            A++;
            pound = 453 * A;
        }
    }
}
