package classes;

import java.util.*;

//remove all even numbers

public class AR2{
    public static void main(String[] args){
        List<Integer> ar = Arrays.asList(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9);
        List<Integer> removed = new ArrayList<>();
        for(int i=0; i<ar.size(); i++){
            if(ar.get(i) % 2 != 0){
                removed.add(ar.get(i));
            }
        }
        System.out.println(ar);
        System.out.println(removed);
    }
}