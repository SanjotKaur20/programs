public class FloydTriangle {
    public static void main(String[] args) {
        int a=10;
        int count=0;
        for (int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
