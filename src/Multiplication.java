public class Multiplication {   public static void main(String[] args) {
        int rows = 9;
        int cols = 9;
        int[][] table = new int[rows][cols];
        System.out.print("\t|\t");
        for (int i = 0; i <= cols; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            System.out.print("\n" + (i + 1) + "\t|\t");
            for (int j = 0; j <= table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.print(table[i][j] + "\t");
            }
        }
        System.out.println("Таблица умножения");
    }
}
