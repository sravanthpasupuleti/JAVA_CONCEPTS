package classes;

import java.util.*;
//Convert an ArrayList<String> into a regular String array and print it.

public class AR4 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>(Arrays.asList("hlo" , "sravanth"));
        String[] original = new String[li.size()];
        for(int i=0; i<li.size(); i++){
            original[i] = li.get(i);
        }
        System.out.println(li);
        System.out.println(Arrays.toString(original));
    }
}
