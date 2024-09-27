class ElectricBill{
    void charge(int unit){
        if(unit<=100){
            System.out.println("Your electricity bill is 0");
        } else if (unit>100 && unit<=200) {
            int b=unit-100;
            int c=b*5;
            System.out.println("your bill is "+c);


        }
        else {
            int d=500+(unit-200)*10;
            System.out.println("your bill is " +d);
        }
    }
}



public class Billlllll {
    public static void main(String[] args) {
        ElectricBill eb=new ElectricBill();
        eb.charge(500);

    }
}
