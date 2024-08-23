package array;

import java.util.Scanner;

public class tcs_CQ_3 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] arr= new int[m][n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int index=0,c=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1)
                c++;
            }
            if(c>max){
                max=c;
                index=i;
            }
            c=0;
        }
        System.out.print("Answer:");
        System.out.println(index+1);
    }
    
}
