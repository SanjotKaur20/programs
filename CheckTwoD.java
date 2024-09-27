import java.util.Scanner;

public class CheckTwoD {
    public static void main(String[] args) {
        //int arr[][]=new int[3][3];
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int row = 3;
        int col = 3;
        int flag=0;
        int arr[][] = {{2, 3, 4}, {6, 7, 8}, {5, 9, 1}};
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j]==n){
                    flag++;
                    System.out.println("Number in arrray");
                    break;
                }

            }
        }if (flag==0){
            System.out.println("Number not in array");
        }
    }
}