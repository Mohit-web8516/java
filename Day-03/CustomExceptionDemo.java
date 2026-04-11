// public class CustomException {
    
// }


////////////////////////////////////////////
// class InsufficientBalanceException
// extends Exception{
//     public InsufficientBalanceException(

//         String msg;
//     )
//     {
//         super(msg);
//     }

//     }
///////////////////////////////////////////
// Step 1: Define custom exception
// class CustomException extends Exception {
//     public CustomException(String message) {
//         super(message);
//     }
// }

// public class CustomExceptionDemo {
//     // Step 2: Method that validates age
//     public static void validateAge(int age) throws CustomException {
//         if (age < 18) {
//             // Throw custom exception if condition fails
//             throw new CustomException("Age must be 18 or above to vote.");
//         } else {
//             System.out.println("Age is valid. You can vote!");
//         }
//     }

//     public static void main(String[] args) {
//         try {
//             // Step 3: Call method with invalid age
//             validateAge(15);
//         } catch (CustomException e) {
//             // Handle exception
//             System.out.println("Caught a custom exception: " + e.getMessage());
//         }
//     }
// }
