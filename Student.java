class AttendanceOf {
    void percentage(int a,int b) {
        int sum = a + b;
        int per = (a / sum) * 100;
        if (per > 75) {
            System.out.println("You are not able to sit in exam");

        } else {
            System.out.println("You are able to sit in exam");
        }

    }
}



public class Student {
    public static void main(String[] args) {
        AttendanceOf  at=new AttendanceOf();
        at.percentage(40,60);

    }
}
