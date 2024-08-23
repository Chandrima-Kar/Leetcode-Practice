// To verify whether a given input string is a valid e-mail id match it with the following is the regular expression to match an e-mail id −

// "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"
package interview;
import java.util.*;


public class valid_email_id {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your email:");
        String email=sc.nextLine();
        String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        if(email.matches(regex)) {
         System.out.println("Given email-id is valid");
      } else {
         System.out.println("Given email-id is not valid");
      }
    }
}
