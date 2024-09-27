import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=scanner.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        for (int i=0;i<arr.length-1;i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
             min=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
