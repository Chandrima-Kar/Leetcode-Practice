package array;
import java.util.*;

import java.util.Scanner;

public class tcs_CQ_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        char[] arr= new char[n];
        for(int i=0;i<n;i++)
        arr[i]= sc.next().charAt(0);
        int lower[] = new int[26];
        int upper[] = new int[26];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>='A' && arr[i]<='Z'){
                upper[arr[i]-'A']++;
            }
            else if(arr[i]>='a' && arr[i]<='z'){
                lower[arr[i]-'a']++;
            }
        }
        boolean flag = false;
        char ch = '\0';
        for(int i=0;i<n;i++){
            if(arr[i]>='A' && arr[i]<='Z'){
                if(upper[arr[i]-'A']%2==1)  {
                    ch=(char)(arr[i]);
                    flag=true;
                }
            }
                else if(arr[i]>='a' && arr[i]<='z'){
                     if (lower[arr[i] - 'a'] % 2 == 1)
                {
                    ch = (char) (arr[i]);
                    flag = true;
                    break;
                }
                }

            }
            if (flag == true)
            System.out.println (ch);
        else
            System.out.println ("All are even");
        }
    }

