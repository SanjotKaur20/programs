public class FuncOfStrng {
    public static void main(String[] args) {
        String s="My name is Sanjot";
        String m="From CSE";
        System.out.println(s.length());
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.indexOf(" "));
        System.out.println(s.charAt(5));
        System.out.println(s.substring(4,8));
        System.out.println(s.substring(4));
        System.out.println(s+" "+m);
        System.out.println(s.concat(m));
        char [] arr=s.toCharArray();
        System.out.println(arr[8]);
        System.out.println(arr.length);
      System.out.print("{");

        for (int i=0;i<arr.length;i++) {
            if (i == 0) {
                System.out.print("{");

            }

            System.out.print(arr[i] + ",");

            if (i == arr.length-1){
                System.out.print("}");
            }

        }
    }
}
