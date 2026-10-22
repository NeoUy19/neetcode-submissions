class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        int area = 0;
        int n = heights.length;
        int start;
        for (int i = 0 ; i < n ; i++){
            int currHeight = heights[i];
            start = i;
            while (!stack.isEmpty() && stack.peek().getValue() > currHeight){ //if the value of the top of our stack is greater than our current height the end of the previous rectangle is found pop from the stack
                Pair<Integer, Integer> temp = stack.pop();
                int height = temp.getValue();
                int prevIndex = temp.getKey();
                area = Math.max(area,height * (i - prevIndex));
                start = prevIndex;
            }
            stack.push(new Pair(start,currHeight));
        }
        while (!stack.isEmpty()){
            Pair<Integer, Integer> temp = stack.pop();
            int height = temp.getValue();
            int index = temp.getKey();
            area = Math.max(area, height * (n - index));
        }
        return area;
    }
}
