class Vote{
    void CanVote(int a) {
        if (a >= 18) {
            System.out.println("Can Vote");
        } else {
            System.out.println("Cannot Vote");
        }


}}




public class Age {
    public static void main(String[] args) {
        Vote v=new Vote();
        v.CanVote(17);
    }
}

