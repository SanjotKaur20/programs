import java.util.Scanner;

public class rockPaper {
    public static void main(String[] args) {
        String str="";
        String b;
        do{
        Scanner sc = new Scanner(System.in);
        int r=(int) (Math.random() *100);
        if (r<=33) {
            str="scissor";

        }else if (r>33 && r<=67){
            str="rock";
            }
        else if (r>67){
            str="paper";
        }

            System.out.println("Enter your move(r/p/s)");
            String ans = sc.next();
            if (str.equalsIgnoreCase("rock") && ans.equalsIgnoreCase("paper")) {
                System.out.println("You win "+" Paper cover rock");
            } else if (str.equalsIgnoreCase("rock") && ans.equalsIgnoreCase("rock")){
                System.out.println("Draw");
            }
            else if (str.equalsIgnoreCase("rock")&& ans.equalsIgnoreCase("scissor")){
                System.out.println("You loose! scissor cuts paper");
            }else if (str.equalsIgnoreCase("paper")&& ans.equalsIgnoreCase("rock")){
                System.out.println("you loose ! paper cover rock");
            }else if (str.equalsIgnoreCase("paper")&& ans.equalsIgnoreCase("paper")){
                System.out.println("Draw");
            } else if (str.equalsIgnoreCase("paper")&& ans.equalsIgnoreCase("scissor")) {
                System.out.println("You win! Scissor cuts paper");
            }else if (str.equalsIgnoreCase("scissor")&& ans.equalsIgnoreCase("rock")){
                System.out.println("You win ! Rock breaks scissor");
            } else if (str.equalsIgnoreCase("scissor") && str.equalsIgnoreCase("paper")) {
                System.out.println("Yoy loose ! ");

            } else if (str.equalsIgnoreCase("scissor")&& str.equalsIgnoreCase("scissor")) {
                System.out.println("Draw");
            }
            System.out.println("Do you want to continue");
            b=sc.next();



        }while (b.equalsIgnoreCase("Y"));


    }
}
