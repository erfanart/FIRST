import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
//[1 3 5]
//1 5 7 91
//[1 2 0]
// 111 6 4 21
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter row number: ");
        int row = scanner.nextInt();

        System.out.println("Enter column number: ");
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter element [" + i + "," + j + "]");
                int ij = scanner.nextInt();
                matrix[i][j] = ij;
            }
        }
        System.out.println(matrix);//ادرسش تو رم
        System.out.println(Arrays.deepToString(matrix));//خود ارایه
    }
}
