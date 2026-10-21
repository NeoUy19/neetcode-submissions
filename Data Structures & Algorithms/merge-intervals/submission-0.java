class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] result = new int[intervals.length][2];
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int currStart = intervals[0][0];
        int currEnd = intervals[0][1];
        int k = 0;
        for (int i = 1 ; i < intervals.length ;i++){
            int ithStart = intervals[i][0];
            int ithEnd = intervals[i][1];
           if (currEnd >= ithStart ){
                currEnd = Math.max(currEnd, ithEnd);
           }
           else {
                result[k] = new int[]{currStart, currEnd};
                k++;
                currStart = intervals[i][0];
                currEnd = intervals[i][1];
           }
        }
        result[k] = new int[]{currStart, currEnd};
        k++;
        return Arrays.copyOf(result, k);
    }
}
