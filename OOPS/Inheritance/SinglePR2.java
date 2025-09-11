public class SinglePR2 extends SinglePR{

    String name = "Sravanth2";

    public void Hi(){
        System.out.println("SinglePR2 hi method");
    }

    public static void main(String[] args) {
        SinglePR obj2 = new SinglePR2();
        obj2.Hi();
        System.out.println(obj2.name);
    }
}
