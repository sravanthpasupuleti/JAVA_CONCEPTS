public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        Bricks br = new Bricks();

        Runnable run1 = () -> {
            for(int i=1; i<=1000; i+=10){
                br.fun();
            }
        };

        Runnable run2 = () -> {
            for(int i=1; i<=1000; i+=10){
                br.fun();
            }
        };

        Thread th = new Thread(run1);
        Thread th2 = new Thread(run2);
        th.start();
        th.join();
        th2.start();
        th2.join();

        System.out.println(br.marks);
    }
}

class Bricks{

    int marks = 0;

    void fun(){
        marks += 10;
    }
}