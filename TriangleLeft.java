public class TriangleLeft {
    public static void main(String[] args) {
        int a= 4;
        for (int i = 0; i <a; i++) {
            for (int j=0;j<a-i;j++){
                System.out.print(" ");
            }

                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

