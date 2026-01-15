import java.util.*;

public class Two{
    public static void main(String[] args){
        List<Integer> li = new ArrayList<>(Arrays.asList(12 ,7 , 4 , 8 , 2));

       li.forEach(el -> {
            if(el%2 == 0){
                System.out.println(el);
            }
        }); 
    }
}