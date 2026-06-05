public class MtSecondType{
    public static void main(String[] args) {

        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());

        Emps obj = new Emps();
        Thread t1 = new Thread(obj, "emps");
        t1.start();

        Work obj2 = new Work();
        Thread th = new Thread(obj2, "work");
        th.start();

        System.out.println(Thread.activeCount());
    }
}

class Emps implements Runnable{

    @Override
    public void run(){
        System.out.println("heyyy "+Thread.activeCount());
        System.out.println("heyyy "+Thread.currentThread().getName());
    }
}

class Work extends Thread{
    public void run(){
        System.out.println("hlooo "+Thread.activeCount());
        System.out.println("hloo "+Thread.currentThread().getName());
    }
}