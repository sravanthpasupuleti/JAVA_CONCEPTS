
import java.util.Arrays;
import java.util.Comparator;

public class StringWithStream{
    public static void main(String[] args){

    String s = "Our channel provides Amazing Automation for Java and Selenium learners and professionals applea";
    
    Arrays.stream(s.split(" ")).map(String::toLowerCase)
                                      .filter(ele -> ele.startsWith("a"))
                                      .map(ele -> {
                                        String e = "";
                                        for(int i=ele.length() - 1; i>=0; i--){
                                            e += ele.charAt(i); 
                                        }
                                        return e;
                                       })
                                    //   .sorted(Comparator.comparingInt(String::length))   for ascending
                                       .sorted(Comparator.comparingInt(String::length).reversed())  //for descending arder
                                      .forEach(System.out::println);
    }
}