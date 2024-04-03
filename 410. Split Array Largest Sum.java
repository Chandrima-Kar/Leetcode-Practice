class Solution {
    public int splitArray(int[] nums, int k) 
    {
        int max=0,sum=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i])
                max=nums[i];
            sum+=nums[i];
        }
        int low=max,high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            int noOfSplits=count(nums,mid);
            if(noOfSplits>k){
                low=mid+1;
            }
            else
            high=mid-1;
        }
        return low;
    }
    int count(int[] arr, int x){
        int c=1;//to count the maximum number of subarrays
        long nums=0;
        for(int i=0;i<arr.length;i++){
            if(nums+arr[i]<=x){//if sum of consecutive array element is not more than maximum
                nums+=arr[i];// we keep on adding
            }
            else{
            c++;// increase the numbe of subarrays
            nums=arr[i];// new subarray
        }}
        return c;// return the number of subarrays
    }

}