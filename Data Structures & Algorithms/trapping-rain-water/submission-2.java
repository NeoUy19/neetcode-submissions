class Solution {
    public int trap(int[] height) {
        int result = 0;
        int i = 0;
        int j = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;

        while (i < j){
            if (height[i] <= height[j]){
                if (height[i] > maxLeft){
                    maxLeft = height[i];
                }
                else{
                    result += (maxLeft - height[i]);
                }
                i++;
            }
            else if(height[i] > height[j]){
                if (height[j] > maxRight){
                    maxRight = height[j];
                }
                else {
                    result += (maxRight - height[j]);
                }
                j--;
            }
        }
        return result;
    }
}
