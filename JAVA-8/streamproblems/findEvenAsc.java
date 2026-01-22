
import java.util.*;

public class FindEvenAsc {
    public static void main(String[] args) {
        Integer[] numbers = {3,6,1,8,5,10,7};

        // List<Integer> numbers = new ArrayList<>(Arrays.asList(3,6,1,8,5,10,7));

        //find even , calculate their squares and print in increasing order and also show how many
          //numbers met the criteria.
          
        long c = Arrays.stream(numbers)
                .filter(num -> num%2 == 0)
                .map(num -> num*num).sorted()
                .peek(System.out::println).count();

        System.out.println(c);
    }

}
