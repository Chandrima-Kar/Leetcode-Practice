package array;

public class difference_of_sum {
    public static void main(String[] args) {
        int[] nums={4,2,5,6,3,9};
        System.out.println(difference(nums));
    }
    public static int difference (int[] nums){
        int se=0,so=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
                se+=nums[i];
            else
                so+=nums[i];
        }
        return so-se;
    }
}
