package JavaYoutube;

public class ArrayDvuxmernii {
    public static void main(String[] args) {
        int [][] a= {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        for(int i=0; i<a.length;i++){ //переход по строкам (1,2,3)...(4,5,6)..
            for(int j=0;j<a[i].length;j++){ // переход ро столбцам каждое чило 1,2,3,4,5,6...
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
