package string;
import java.util.*;

public class uppercase_lowercase {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s;
        System.out.println("Enter string");
        s=sc.nextLine();
        System.out.println(find(s));
    }
    public static String find(String str){
        int uc=0,lc=0;
        for(int i=0;i<str.length();i++){
            int a=(int)str.charAt(i);
            if(a>=65 && a<=90){
            uc++;}
            else {
            lc++;}
        }
        if(uc>lc){
            str=str.toUpperCase();}
        else{
            str=str.toLowerCase();}
        return str;
    }
}
