import java.util.*;

public class IteratorOne{
    public static void main(String[] args){

        //iterator is an interface , it is used to iterate the one by one element from the collection
        //in this we can remove the element also
        //we can use this for every classes in the collection frameework

        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);

        Iterator<Integer> e = li.iterator();
        System.out.println(e.hasNext());

        while(e.hasNext()){
            int val = e.next();
            if(val == 2){
                e.remove();
            }else{
            System.out.println(val);
            }
        }

        System.out.println(li);
    }
}