class Solution {
    public int trap(int[] height) {
        int result = 0;
        int i = 0 ; 
        int j = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        while (i<j){
            if (height[i] <= height[j]){
                if(height[i] > leftMax){
                    leftMax = height[i];
                }
                else{
                     result = result + (leftMax - height[i]);
                }
                i++;
            }
            else if (height[i] > height[j]){
                if (height[j] > rightMax){
                    rightMax = height[j];
                }
                else{
                    result = result + (rightMax - height[j]);
                }
                j--;
            }
        }
        return result;
    }
}
