public class HollowRect {
    public static void main(String[] args) {
        int a=4;
        int b=6;
        for (int i=0;i<=a;i++){
            for (int j=0;j<=b;j++){
                if (i==0||i==a||j==0||j==b){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
