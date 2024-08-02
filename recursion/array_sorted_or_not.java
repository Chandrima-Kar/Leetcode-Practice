public class array_sorted_or_not {
    static boolean sorted(int[] nums,int n){
        if(n==0 || n==1)
        return true;
        else
         return (nums[n-1]>nums[n-2] && sorted(nums, n-1));
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 70, 66, 88 };
        System.out.println(sorted(arr,arr.length));

    }
}
