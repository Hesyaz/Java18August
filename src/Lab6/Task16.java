package Lab6;

public class Task16 {
    public static void main(String[] args) {
        int a,b,result,sum;
        a = 20;
        b = 40;
        result = 0;
        sum  = 0;

        while(a<=b){
           // System.out.print(result+" ");
            result = a*a*a;
            a++;
            sum+=result;
            System.out.print(sum +" ");
        }
    }
}
