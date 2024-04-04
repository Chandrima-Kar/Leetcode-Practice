class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weights.length; i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            int num = possible(weights, mid);
            if (num <= days)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    int possible(int[] arr, int c) {
        int s = 0, k = 1;
        for (int i = 0; i < arr.length; i++) {
            if (s + arr[i] > c) {
                k++;
                s = arr[i];
            } else {
                s += arr[i];
            }
        }
        return k;
    }
}