public class Main{
    public static void main(String[] args){

        Operation1 op2 = (one , two) -> one + two;
        System.out.println(op2.findSum(2,2));

        Operation2 op3 = (one , two) -> one > two;
        boolean b = op3.find(2,3);
        System.out.println(b);

        Operation3 op4 = (name , version) ->System.out.println("i have learnt "+name+" language "+version+" version");
        op4.find("java" , 21);
    }   

}