import java.util.Scanner;

class Micro {
    private String type_of_Agency;
    private int bitSize;
    private int Amount;

    void setType_of_Agency(String type_of_Agency) {
        this.type_of_Agency = type_of_Agency;

    }

    void setBitSize(int bitSize) {
        this.bitSize = bitSize;
    }

    void setAmount(int Amount) {
        this.Amount = Amount;

    }

    void Cal() {
        if (bitSize == 64) {
            if (type_of_Agency .equalsIgnoreCase("industrial") && Amount <= 50000) {
                double a = this.Amount * 0.05;
                System.out.println(a);

            } else if (type_of_Agency.equalsIgnoreCase( "university") && Amount <= 50000) {
                double a = this.Amount * 0.065;
                System.out.println(a);

            } else if (type_of_Agency .equalsIgnoreCase("government") && Amount <= 50000) {
                double a = this.Amount * 0.055;
                System.out.println(a);
            } else if (type_of_Agency .equalsIgnoreCase("industrial") && Amount >= 50000 && Amount <100000) {
                double a = this.Amount * 0.075;
                System.out.println(a);

            } else if (type_of_Agency.equalsIgnoreCase( "university" )&& Amount >=50000 && Amount <100000) {
                double a = this.Amount * 0.085;
                System.out.println(a);

            } else if (type_of_Agency .equalsIgnoreCase( "government") && Amount >= 50000 && Amount < 100000) {
                double a = this.Amount * 0.085;
                System.out.println(a);
            } else if (type_of_Agency .equalsIgnoreCase( "industrial") && Amount > 100000) {
                double a = this.Amount * 0.10;
                System.out.println(a);


            } else if (type_of_Agency.equalsIgnoreCase("university") && Amount > 100000) {
                double a = this.Amount * 0.095;
                System.out.println(a);

            } else {
                double a = this.Amount * 0.10;
                System.out.println(a);

            }

        } else if (bitSize ==32) {
             if (type_of_Agency .equalsIgnoreCase( "industrial") &&  Amount<10000) {
                double a = this.Amount ;
                System.out.println(a);

            } else if (type_of_Agency.equalsIgnoreCase("university")&& Amount<10000) {
                 double a=this.Amount;
                 System.out.println(a);
             } else if (type_of_Agency.equalsIgnoreCase("government")&& Amount<10000) {
                 double a=this.Amount;
                 System.out.println(a);
             } else if (type_of_Agency.equalsIgnoreCase("industrial")&& Amount<=10000) {
                 double a=this.Amount*0.05;
                 System.out.println(a);
             } else if (type_of_Agency.equalsIgnoreCase("university")&& Amount<=10000) {
                 double a=this.Amount*0.055;
                 System.out.println(a);
             } else{
                 double a=this.Amount*0.04;
                 System.out.println(a);
             }

             }else{
              if (type_of_Agency.equalsIgnoreCase("industrial")&& Amount<5000) {
                double a=this.Amount;
                System.out.println(a);
            } else if (type_of_Agency.equalsIgnoreCase("university")&& Amount<5000) {
                  double a=this.Amount;
                  System.out.println(a);
              }else if (type_of_Agency.equalsIgnoreCase("government")&& Amount<5000) {
                  double a=this.Amount;
                  System.out.println(a);
              }else if (type_of_Agency.equalsIgnoreCase("industrial")&& Amount<=5000) {
                  double a=this.Amount*0.10;
                  System.out.println(a);
              }else if (type_of_Agency.equalsIgnoreCase("university")&& Amount<=5000) {
                  double a=this.Amount*0.10;
                  System.out.println(a);
              }
              else{

                      double a=this.Amount*0.10;
                      System.out.println(a);
                  }
              }
        }
        }

public class MicroProcessor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Micro m=new Micro();
        System.out.println("Enter the type of Agency:");
        m.setType_of_Agency(sc.next());
        System.out.println("Enter the bit Size");
        m.setBitSize(sc.nextInt());
        System.out.println("Enter the Amount");
        m.setAmount(sc.nextInt());
        m.Cal();
    }
}
