class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int n = n1 + n2;
        int i = 0, j = 0;
        int ind2 = n / 2;
        int ind1 = ind2 - 1;
        int cnt = 0;
        int ind1ele = -1, ind2ele = -1;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                if (cnt == ind1)
                    ind1ele = nums1[i];
                if (cnt == ind2)
                    ind2ele = nums1[i];
                cnt++;
                i++;
            } else {
                if (cnt == ind1)
                    ind1ele = nums2[j];
                if (cnt == ind2)
                    ind2ele = nums2[j];
                cnt++;
                j++;
            }
        }
        while (i < n1) {
            if (cnt == ind1)
                ind1ele = nums1[i];
            if (cnt == ind2)
                ind2ele = nums1[i];
            cnt++;
            i++;
        }
        while (j < n2) {
            if (cnt == ind1)
                ind1ele = nums2[j];
            if (cnt == ind2)
                ind2ele = nums2[j];
            cnt++;
            j++;
        }
        if (n % 2 == 1) {
            return (double) ind2ele;
        }

        return (double) ((double) (ind1ele + ind2ele)) / 2.0;
    }
}