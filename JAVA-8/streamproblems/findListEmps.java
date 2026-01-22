import java.util.*;

public class FindListEmps{
    public static void main(String[] args) {
    List<String> emps = new ArrayList<>(Arrays.asList("John", "Alexandra" , "Ben" , "David" , "Sravanth" , "Amy"));

    

    //create a stream to find the the emps whose name atleast min 5 char and convert theor names into
        //uppercase and finally print those names in alphabitically order.

    emps.stream().filter(name -> name.length()>=5).map(String::toUpperCase).forEach(System.out::println);

    }
}