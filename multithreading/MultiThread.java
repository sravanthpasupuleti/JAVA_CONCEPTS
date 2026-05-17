public class MultiThread {
    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.start();

        Manager manager = new Manager();
        manager.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.activeCount());

    }
}

class Emp extends Thread{  //thread is a class

    @Override
    public void run(){
        System.out.println("hloooooo emp thread " + Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
    }

}

class Manager extends Thread{
    @Override
    public void run(){
        System.out.println("hlo Manager thread " + Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
    }
}
