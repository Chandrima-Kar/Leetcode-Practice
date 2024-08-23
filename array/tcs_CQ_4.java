package array;
import java.util.*;

public class tcs_CQ_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter time: ");
        int t= sc.nextInt();
        System.out.println("Enter the entry times one by one: ");
        int[] a = new int[t];
        int[] b = new int[t];
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the exit times one by one: ");
        for(int i=0;i<t;i++){
            b[i]=sc.nextInt();
        }
        int noOfGuests=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<t;i++){
            noOfGuests=noOfGuests+a[i]-b[i];
            max=Math.max(max,noOfGuests);
        }
        System.out.println(max);
    }
}
