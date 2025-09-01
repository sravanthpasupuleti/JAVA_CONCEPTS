
import custumer.Custumer;
import java.io.IOException;


public class Serviceimpl2 implements Service{
    public void ar(Integer... array) throws IOException {
        Custumer cust = new Custumer();
            int result = 0;
            try(cust) {
                if (array[1] == 0) {
                throw new IOException("cannot divide by "+array[1]);
                }
                cust.Resource();
                result = array[0]/array[1];
                System.out.println("result is :"+result);
            } catch (Exception e) {
                System.out.println("Exception handled in "+this.getClass());
                throw e;
            } 
            // finally {
            //     System.out.println("finally block");
            //     cust.Close();
            // }
           
    }
}