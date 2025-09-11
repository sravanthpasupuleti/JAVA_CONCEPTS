public class SinglePR3 extends SinglePR2{

    String name = "Sravanth3";

    public void Hi(){
        System.out.println("SinglePR3 Hi method");
    }
    public static void main(String[] args) {
        SinglePR2 obj3 = new SinglePR3();
        obj3.Hi();
        System.out.println(obj3.name);
    }
}
