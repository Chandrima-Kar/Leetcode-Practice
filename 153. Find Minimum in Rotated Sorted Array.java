class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length - 1, minn = Integer.MAX_VALUE;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (nums[l] <= nums[mid]) {
                minn = Math.min(minn, nums[l]);
                l = mid + 1;
            } else {
                minn = Math.min(minn, nums[mid]);
                h = mid - 1;
            }
        }
        return minn;
    }
}