import java.time.LocalDateTime;

public class Main{
    public static void main(String[] args){
        Operation1 op1 = num -> num >= 0;
        boolean res = op1.finnum(-2);
        System.out.println(res);

        Operation2 op2 = (ver) -> System.out.println("My java version is "+ ver);
        op2.javaVersion(21);

        Operation3 op3 = () -> LocalDateTime.now();

        System.out.println(op3.generate());
    }
}