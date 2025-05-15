package Exception;

public class ExceptionLearn {
    public static void runningException(){
        int i=3523;
        try{
            if(i>1000){
                throw new DividebyNException("Number is greater than 1000");
            }
            int c=10/i;
        }
        catch(ArithmeticException e){
            System.out.println("/ by 0 exception occured "+e);
        }
        catch (NullPointerException e){
            System.out.println("Null pointer exception occured "+e);
        }
        catch (Exception e){
            System.out.println("Exception occured "+e);
        }
        finally {
            System.out.println("Finally block executed");
            //generally used to close the resources
        }
    }
}

class DividebyNException extends Exception{
    DividebyNException(String s){
        super(s);
    }
}
