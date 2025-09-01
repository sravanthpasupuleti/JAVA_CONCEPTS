package classes;

import java.util.LinkedList;

public class One{
    public static void main(String[] args){
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(2);
        l1.addFirst(10);
        l1.add(7);
        l1.add(3);
        l1.addFirst(1);
        System.out.println(l1);
       
        l1.remove(2);
        System.out.println(l1);
    }
}