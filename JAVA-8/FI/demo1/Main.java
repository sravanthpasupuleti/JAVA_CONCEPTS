public class Main{
    public static void main(String[] args){
        System.out.println("hlo world");

        Operation1 op = num -> ++num;

        System.out.println(op.addOne(1));
    }
}