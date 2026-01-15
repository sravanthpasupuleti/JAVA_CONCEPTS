public class AbstractPR2 extends AbstractPR1{
    public void city(){
        System.out.println("Tadipatri");
    }
    public static void main(String[] args) {
        AbstractPR1 obj = new AbstractPR2();
        obj.name();
        obj.city();
    }
}
