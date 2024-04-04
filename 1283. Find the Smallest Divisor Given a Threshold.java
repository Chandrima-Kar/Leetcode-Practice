class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int min = 1, max = Integer.MIN_VALUE;// minimum divisor is 1
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        while (min <= max) {
            int mid = (min + max) / 2;
            if (possible(nums, mid, threshold)) {// to check if a particular value is a divisor or not
                max = mid - 1;// to find a possibly smaller divisor
            } else
                min = mid + 1;
        }
        return min;
    }

    boolean possible(int[] arr, int k, int limit) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += (Math.ceil((double) arr[i] / k));// summation of division's result when divide by k'
        }
        if (s <= limit)// to check if summation is within threshold
            return true;
        return false;
    }
}