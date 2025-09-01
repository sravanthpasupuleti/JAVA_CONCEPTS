package custumer;

public class Custumer implements AutoCloseable{
    public Custumer(){
        System.out.println("hlo custumer");
    }

    public void Resource(){
        System.out.println("Resource method");
    }

    public void close(){
        System.out.println("Close method");
    }
}
