public class SinglePR{

    String name = "Sravanth";

    public void Hi(){
        System.out.println("SinglePR hi method");
    }

    public static void main(String[] args){
        SinglePR obj = new SinglePR();
        obj.Hi();
        System.out.println(obj.name);
    }
}
