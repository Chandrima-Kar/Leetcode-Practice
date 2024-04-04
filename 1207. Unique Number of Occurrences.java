class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else
                map.put(arr[i], 1);
        }
        HashSet<Integer> uniqueCountsSet = new HashSet<>();

        for (int count : map.values()) {
            if (!uniqueCountsSet.add(count)) {
                return false;
            }
        }

        return true;
    }
}