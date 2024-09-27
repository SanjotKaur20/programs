import javax.lang.model.element.Element;
import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter the length of array");
        int n=scanner.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        for (int i=0;i<arr.length-1;i++) {
            //.out.println("element "+(i+1)+" is "+arr[i]);

            if (arr[i] < arr[i+1]) {
//                System.out.println("sorted");

            } else if(arr[i]>arr[i+1]){
//                System.out.println("not sorted");
                flag++;
                break;
            }


        }
        if (flag==0){
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not sorted");
        }


        //int last=arr.length-1;
        //arr[last]=scanner.nextInt();


        System.out.println(Arrays.toString(arr));


      //  arr[0]=3;
        //arr[1]=6;
        //arr[2]=9;
        //arr[3]=7;
        //System.out.println(Arrays.toString(arr));
        //String arr1[]={"Apple","Mango","Grapes","Litchi"};
        //System.out.println(arr1[2]);
        //System.out.println(arr1.length);
    }
}