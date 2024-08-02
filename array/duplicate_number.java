// question number:287
package array;



public class duplicate_number {
    public static void main(String[] args) {
    int[] arr={3, 1, 4, 4, 2};
    System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        int slow, fast;
        slow=nums[0];
        fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        while(slow!=fast);

        fast=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return fast;
    }
}
