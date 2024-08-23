package array;
import java.util.*;

public class tcs_CQ_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s;
        System.out.println("Enter string: ");
        s=sc.nextLine();
        int s1=0,s2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*')
            s1++;
            if(s.charAt(i)=='#')
            s2++;
        }
        System.out.println(s1-s2);
    }
    
}
