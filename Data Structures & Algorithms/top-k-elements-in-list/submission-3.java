class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> mapped = new HashMap<>();
       for (int i = 0 ; i < nums.length ;i ++){
        mapped.put(nums[i], mapped.getOrDefault(nums[i], 0) + 1);
       }
        List<Integer>[] bucket = new List[nums.length + 1];
        for (Map.Entry<Integer,Integer> c : mapped.entrySet()){
            int frequency = c.getValue();
            if (bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(c.getKey());
        }
        int[] result = new int[k];
        int resultCount = 0;
        for(int i = bucket.length - 1 ; i > 0 ; i--){
            if (bucket[i] != null){
                for (int num : bucket[i]){
                    result[resultCount] = num;
                    resultCount++;

                    if (resultCount == k){
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
