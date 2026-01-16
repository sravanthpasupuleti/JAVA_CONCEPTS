import java.util.*;

public class One{

    private String e;

    public One(String e){
        this.e = e;

        System.out.println(e);
    }

    public static void sayHi(String arg){
        System.out.println("i am "+arg);
    }

    public void sayHlo(String arg){
       System.out.println("i am "+arg);
    }

    public static void main(String[] args){
        List<String> li = new ArrayList<>(Arrays.asList("hi" , "hlo" , "sravanth" , "royal" , "Batman"));

        One o = new One("sravaaaaaaaaaaaaaaaanth");

        // li.forEach(ele -> System.out.print(ele));

        // System.out.println(" ---- ");

        // li.forEach(System.out::print);

        // System.out.println(" ---- ");

        // li.forEach(el -> sayHi(el));

        // System.out.println(" ---- ");
        
        // li.forEach(One::sayHi);

        System.out.println(" ---- ");

        li.forEach(o::sayHlo);

        // li.forEach(String::toUpperCase);
        // li.forEach(System.out::println);

        li.forEach(One::new );
    }
}