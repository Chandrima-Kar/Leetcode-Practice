package math;
import java.util.*;

public class add_binary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a,b;
        System.out.println("Enter first number");
        a=sc.nextLine();
        System.out.println("Enter second number");
        b=sc.nextLine();
        System.out.println(addBinary(a,b));
        sc.close();

    }
    public static String addBinary(String a, String b) {
        StringBuilder sb= new StringBuilder();
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0 || j>=0 ||carry==1){
            if(i>=0)
                carry+=a.charAt(i--)-'0';
            if(j>=0)
                carry+=b.charAt(j--)-'0';
            sb.append(carry%2);
            carry/=2;
        }
    return sb.reverse().toString();
    }
}
