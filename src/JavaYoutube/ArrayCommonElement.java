package JavaYoutube;

public class ArrayCommonElement {
    public static void main(String[] args) {
        int [] array1= {1,2,3,4,5,6};
        int [] array2= {6,3,2};

        // array1 iteration
        for(int i=0; i<array1.length;i++){

            //array2 iteration
            for(int j=0; j<array2.length;j++){

                if(array1[i]==array2[j]){
                    System.out.print(array1[i] + " ");
                }
            }
        }
    }
}
