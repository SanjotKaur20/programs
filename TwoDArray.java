import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows");
        int row = scanner.nextInt();
        System.out.println("Enter cols");
        int col = scanner.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //  arr[i][j] = j;

arr[i][j]=scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            if (i==0 ) {
                System.out.print("{");
            }
            System.out.print("{");
            for (int j = 0; j < col; j++) {
                if (j==(col-1)) {
                    System.out.print(arr[i][j] + " ");
                }else {
                    System.out.print(arr[i][j] + ", ");
                }

            }

            System.out.print("}");

             if (i >= (arr.length-1)){
                 System.out.println("}");
             }

            System.out.println();
        }}
    }

