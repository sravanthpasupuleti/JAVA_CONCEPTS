
public class Serviceimpl implements Service{
    public void ar(Integer... array){
            int result = 0;
            if (array[1] == 0) {
                throw new NullPointerException("cannot divide "+array[0]+" by "+array[1]);
            }
            result = array[0]/array[1];
           
            System.out.println("result is :"+result);
        // catch(Exception exception){
        //     System.out.println("Something went wrong" + exception.getMessage());
        // }
        // catch(ArrayIndexOutOfBoundsException ex){
        //     // ex.getMessage();
        //     System.out.println("min two arguments are required");
        // }catch(ArithmeticException ex){
        //     System.err.println(array[0]+" is cant divide by "+array[1]);
        // }
    }
}