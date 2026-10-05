class Solution {
    public int maxArea(int[] heights) {
        int greatestArea = 0;
        int i = 0;
        int j = heights.length - 1;
        while (i < j){
         int width = Math.abs(j - i);
         int currArea = Math.min(heights[i],heights[j]) * width;
         if (currArea > greatestArea){
            greatestArea = currArea;
         }
         if (heights[i] < heights[j]){
            i++;
         }
         else{
            j--;
         }
        }
        return greatestArea;
    }
}
