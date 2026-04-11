public class ExceptionHandling {
    public static void main(String[] args){
        try{
            int result = 10/0; 
            System.out.println("Result : " + result);
        }
        catch(ArithmeticException e ){
            System.err.println("Error: can't divide by zero.  " );

        } catch(Exception e ){

            System.out.println("An unexpected error occured !!" +e.getMessage());
            
        }finally{
            System.out.println("This block will always execute !!!");
        }
    }
}
/*NOTE: AT  */