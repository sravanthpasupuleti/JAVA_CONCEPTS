package classes;

import java.util.*;

//count how many times a specific word appears

public class AR3 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>(Arrays.asList("hlo" , "sravanth" , "royal", "hii" , "hlo" , "royal")); 
        Set<String> s = new LinkedHashSet<>();
        for(int i=0 ; i<li.size(); i++){
            int count = 0;
            for(int j=0; j<li.size(); j++){
                if (li.get(i).equals(li.get(j))) {
                    count++;
                }
            }
            // System.out.println(li.get(i) + " is came " +count + " times ");
            s.add(li.get(i) + " is came " + count + " times ");
        }
        System.out.println(s);
    }
}
