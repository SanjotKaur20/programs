import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows");
        int row = scanner.nextInt();
        System.out.println("Enter cols");
        int col = scanner.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //  arr[i][j] = j;

                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
               }
            System.out.println();
        }
        System.out.println("After Transpose");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
      //  System.out.println(sum);
    }
    }