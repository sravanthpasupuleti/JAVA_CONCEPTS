import java.util.Arrays;
import java.util.*;

public class One{
    public static void main(String[] args){
        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(l);

        System.out.println(" ---- ");

        for(Integer e : l){
            System.out.println(e);
        }

        System.out.println(" ---- ");

        l.forEach(ele -> System.out.println(ele * ele));

        System.out.println(" ---- ");

        // l.forEach(ele -> return ele * ele);  by using for Each method we cangt return anyrhing
    }
}