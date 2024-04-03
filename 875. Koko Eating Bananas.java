class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 0, high = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            int t = totalHours(piles, mid);// to calculate the total hours koko needs if she eats bananas at x/hr speed
            if (t <= h)// it means we may have a better answer so we eleiminate the upper half
            {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return low;
    }

    int totalHours(int[] a, int x)// to calculate the total number of hours taken to eat bananas if koo decides to
                                  // eat x bananas per hour
    {
        int tH = 0;
        for (int i = 0; i < a.length; i++) {
            tH += Math.ceil((double) (a[i]) / (double) (x));// ceil function so that if koko can eat 4 bananas and pile
                                                            // has 6 bananas:
            // Math.ceil(6/4)=2,Math.ceil(3/4)=1
        }
        return tH;
    }
}