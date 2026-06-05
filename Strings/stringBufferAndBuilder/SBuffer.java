//The Only Difference between the two is , the StringBuffer is Synchronized and the StringBUilder is not.

public class SBuffer {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("sravanth");  //memor address = 16
        StringBuffer sb2 = new StringBuffer("sravanth");  //memor address = 23

        System.out.println(sb1 == sb2); //false

        sb1 = sb1.append(" royal"); ////memor address = 16 (even after updating the string it has not changed the memory address, thats why Stringbuffer is mutable)
        StringBuffer sb3 = new StringBuffer("sravanth royal");//memor address = 24

        System.out.println(sb1 == sb3);
    }
}