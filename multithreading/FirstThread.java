public class FirstThread{
    public static void main(String[] args){
      
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());

        System.out.println("hello");

        Thread th1 = new Thread();
        th1.start();
        Thread th2 = new Thread();
        th2.start();
        // Thread th3 = new Thread();
        // th3.start();
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
    }
}