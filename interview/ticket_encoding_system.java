package interview;
import java.util.*;
public class ticket_encoding_system {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        StringBuilder ticketCode= new StringBuilder("A");
        for(int i=2;i<=n;i++){
            StringBuilder newTicketCode = new StringBuilder();
            char currentChar=ticketCode.charAt(0);
            int charCount=0;
            for(int j=0;j<ticketCode.length();j++){
                if(ticketCode.charAt(j)==currentChar)
                charCount++;
                else{
                    newTicketCode.append(charCount).append(currentChar);
                    currentChar=ticketCode.charAt(j);
                    charCount=1;
                }
            }

            newTicketCode.append(charCount).append(currentChar);
            ticketCode=newTicketCode;

        }
        System.out.println(ticketCode);
        
    }
}
