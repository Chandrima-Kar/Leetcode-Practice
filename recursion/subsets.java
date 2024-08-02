import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int n=arr.length;
        ArrayList<Integer> a= new ArrayList<>();
        //subsetsCall(0,n,a,arr);
        subsetsCallSum(n, n, a, arr,0);
    }
    public static void subsetsCall(int ind, int n,ArrayList<Integer> a,int[] arr){
        if(ind==n){
            System.out.println(a);
            return;
        }
        a.add(arr[ind]);
        subsetsCall(ind+1, n, a, arr);
        a.remove(a.size() - 1);
        subsetsCall(ind+1, n, a, arr);
    }
    public static void subsetsCallSum(int ind, int n,ArrayList<Integer> a,int[] arr,int sum){
        if(ind==n){
        if(sum==2){
            System.out.println(a);
        }
            return;
        
    }
        a.add(arr[ind]);
        subsetsCallSum(ind+1, n, a, arr,sum+arr[ind]);
        a.remove(a.size() - 1);
        subsetsCallSum(ind+1, n, a, arr,sum);
    }
}
