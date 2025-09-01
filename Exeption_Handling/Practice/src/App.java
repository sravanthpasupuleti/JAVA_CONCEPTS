
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Service obj = new Serviceimpl2();
        try {
            // obj.ar(4);
            obj.ar(8,6);
            obj.ar(2,0);
        } catch (Exception exception) {
            System.out.println("Something went wrong"+ exception);
        }
    }
}