package Classes;
import java.util.*;


public class AR1 {
    public static void main(String[] args){
    ArrayList<Integer> ar = new ArrayList<Integer>();
    List<Integer> ar2 = new ArrayList<>();
    ar.add(1);
    ar.add(4);
    ar.add(6);
    ar.add(8);
    ar2.add(11);
    ar2.add(12);
    ar2.add(13);
    ar2.add(8);
    // System.out.println(ar);
    // for (Integer elem : ar) {
    //     System.out.println(elem);
    // }
    // Iterator it = ar.iterator();
    // while(it.hasNext()){
    //     System.out.println(it.next());
    // }
    ar.addAll(ar2);
    System.out.println(ar);
    System.out.println(ar2);
    }
}

