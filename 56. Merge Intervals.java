/*
 * Given an array of intervals where intervals[i] = [starti, endi], merge all
 * overlapping intervals, and return an array of the non-overlapping intervals
 * that cover all the intervals in the input.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 * Example 2:
 * 
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 * 
 */

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();// Create a list to store the merged intervals
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);// Sort the intervals based on the start time using lambda
                                                      // expression
        ans.add(intervals[0]); // Add the first interval to the merged list

        for (int i = 1; i < intervals.length; i++)// Iterate through the sorted intervals
        {
            int[] temp = new int[2];

            if (ans.get(ans.size() - 1)[1] >= intervals[i][0])// If there is an overlap between the last merged interval
                                                              // and the current interval
            {
                temp[0] = Math.min(ans.get(ans.size() - 1)[0], intervals[i][0]);
                temp[1] = Math.max(ans.get(ans.size() - 1)[1], intervals[i][1]);
                ans.set(ans.size() - 1, temp);
            } else
                // If there's no overlap, add the current interval to the merged list
                ans.add(intervals[i]);
        }
        return ans.toArray(new int[ans.size()][]);// Convert the list of merged intervals to a 2D array and return it
    }
}
/*
 * Approach
 * Initilize List ans to store answer.
 * List<int[]> ans = new ArrayList<>();
 * Sort the matrix by reference the first value of array.
 * Arrays.sort(intervals,(a,b)->a[0]-b[0]);
 * Add oth array into the ans list.
 * ans.add(intervals[0]);
 * Iterate thge loop 0th index to intervals length.(Below code into the loop)
 * check if ans.get(ans.size()-1)[1] is greater than intervals[i][0] then merge
 * intervals else add intervals[i] into the ans.
 * for(int i=1;i<intervals.length;i++){
 * int[] temp = new int[2];
 * if(ans.get(ans.size()-1)[1] >= intervals[i][0]){
 * temp[0] = Math.min(ans.get(ans.size()-1)[0],intervals[i][0]);
 * temp[1] = Math.max(ans.get(ans.size()-1)[1],intervals[i][1]);
 * ans.set(ans.size()-1,temp);
 * }else{
 * ans.add(intervals[i]);
 * }
 * }
 * Convert the ans to int array and return it.
 * return ans.toArray(new int[ans.size()][]);
 */

// link-https://leetcode.com/problems/merge-intervals/solutions/4966114/beats-88-11-of-users-with-java-simple-easy-well-explained-solution/
// https://takeuforward.org/data-structure/merge-overlapping-sub-intervals/