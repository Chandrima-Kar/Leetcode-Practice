class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        if (val > bloomDay.length)
            return -1;
        int max = Integer.MIN_VALUE, min = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            max = Math.max(bloomDay[i], max);
            min = Math.min(bloomDay[i], min);
        }
        while (min <= max) {
            int mid = (min + max) / 2;
            if (possible(bloomDay, m, k, mid)) {
                max = mid - 1;// it means there is a minimum possible answer
            } else
                min = mid + 1;
        }
        return min;
    }

    boolean possible(int[] arr, int m, int k, int x)// to calculate if after x days we can make m bouquets each
                                                    // containing k flowers
    {
        int cnt = 0;
        int noOfB = 0;// to count no of bouquets
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x)// to check if at x days the flowers at arr[i] has bloomed or not
                // for example if x=9 and arr[i]is 7 then 7<=9 is true so we can increase the
                // count of flowers
                cnt++;
            else// if it's not we can make the bouquets where no fo bouquets is
            {
                noOfB += (cnt / k);// considering 3rd example cnt=4 and k=3 so we can make one bouquet as we have 4
                                   // adjacent flowers and we need 3 flowers to make one bouquet
                cnt = 0;
            }
        }
        noOfB += (cnt / k);// for the leftover flowers
        return noOfB >= m;// return if it's possible or not
    }

}