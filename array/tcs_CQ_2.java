package array;
import java.util.*;

public class tcs_CQ_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c=1;
        System.out.println("Enter total number of elements: ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max)
            c++;
            max=Math.max(max,arr[i]);
        }
        System.out.println(c);
    }
}
