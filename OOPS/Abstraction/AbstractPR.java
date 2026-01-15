public abstract class  AbstractPR{

    public AbstractPR(){
        System.out.println("AbstractPR Constructor");
    }

    public abstract void Hi();

    public void Hlo(){
        System.out.println("Hlo method");
    }

    public static void main(String[] args){
        AbstractPR obj = new AbstractPR() {
            public void Hi(){
                System.out.println("HI");
            }
        };
        obj.Hlo();
        obj.Hi();
    }
}