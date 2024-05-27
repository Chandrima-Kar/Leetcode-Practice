// import java.util.Arrays;
// class Solution {
//     public int specialArray(int[] nums) 
//     {
//         Arrays.sort(nums);
//         int s=0;
//         int e=nums.length;
//         while(s<=e){
//             int mid=s+(e-s)/2;
//             int res=cnt(nums,mid);
//             if(res==mid){
//                 return mid;
//             }
//             else if(res>mid){
//                 s=mid+1;
//             }
//             else{
//                 e=mid-1;
//             }
//         }
//         return -1;
//     }
//     int cnt(int[]nums,int mid){
//         int c=0;
//         for(int num:nums){
//             if(num>=mid){
//             c++;}
//         }
//         return c;
//     }
// }

class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            int count = 0;
            for (int j : nums)
                if (j >= i)
                    count++;
            if (i == count)
                return i;
        }
        return (-1);
    }
}