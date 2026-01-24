import java.util.*;

public class ListIteratorOne{
    static public void main(String[] args){
        //ListIterator is an interface , this only applicable for the list implementation classses
        //it is used iterate one by one ele fro the collection
        //here we can go backward also

        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);

        ListIterator<Integer> e = li.listIterator();

        while(e.hasNext()){
            int val = e.next();
            if(val % 2 == 0){
                System.out.println(val);
            }
        }

        while(e.hasPrevious()){
            int v = e.previous();
            if(v % 2 != 0){
                System.out.println(v);
            }
        }
    }
}