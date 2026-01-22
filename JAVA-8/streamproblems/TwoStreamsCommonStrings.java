import java.util.*;

public class TwoStreamsCommonStrings {
    public static void main(String[] args) {
        String[] namesSet1 = {"Apple" , "Banana" , "Cherry" , "Mango" , "Avocado"};

        Set<String> namesSet2 = new HashSet<>(Arrays.asList("Banana" , "Avocado" , "Mango"));

        

        namesSet2.stream()
        // Arrays.stream(namesSet1)
        // .filter(ele -> {
        //     for(String e : namesSet2){
        //         if (ele.equals(e)) {
        //             return true;
        //         }
        //     }
        //     return false;
        // })
        .filter(namesSet2::contains)
        // .map( ele -> {
        //     String rev = "";
        //         for(int i = ele.length() - 1; i>=0; i--){
        //             rev = rev + ele.charAt(i);
        //         }
        //         return rev;
        //     }
        // )
        .map(ele -> new StringBuilder(ele).reverse())
        .forEach(System.out::println);
    }
}
