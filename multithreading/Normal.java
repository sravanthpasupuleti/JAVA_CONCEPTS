public class Normal {
    public static void main(String[] args) {
        System.out.println("Normal main method");

        Std std = new Std();
        Thread thStd = new Thread(std);
        thStd.start();

        Sir sir = new Sir();
        Thread thSir = new Thread(sir);
        thSir.start();
    }
}

class Std implements Runnable{

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("std run method");
        }
    }

}

class Sir implements Runnable{

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("sir run method");
        }
    }
    
}