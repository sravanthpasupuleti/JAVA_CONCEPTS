import java.util.*;

public class EnumerationOne{
    public static void main(String[] args){
        Vector<Integer> v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);

        Hashtable<String , Integer> ht = new Hashtable<>();
        ht.put("hi" , 1);
        ht.put("hlo" ,2);

        Enumeration<Integer> e = ht.elements();
        System.out.println(e.hasMoreElements());

        while(e.hasMoreElements()){
            if(e.nextElement() %2 == 0){
                System.out.println(e.nextElement());
            }
        }


        System.out.println(v);
        System.out.println(ht);
    }
}