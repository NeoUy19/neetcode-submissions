class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>(); //deque holds INDEXES NOT VALUES
        int[] results = new int[nums.length - k +1];

        for(int i = 0 ; i < nums.length; i++){
            if (!deque.isEmpty() && deque.peekFirst() <= i - k){//check if the front index expired
            deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]){
                    deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1){
                results[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return results;
    }
}
