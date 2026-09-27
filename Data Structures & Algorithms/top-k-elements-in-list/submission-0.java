class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];    
        for (Map.Entry<Integer, Integer> temp :map.entrySet()){
            int count = temp.getValue();
            if (buckets[count] == null){
                buckets[count] = new ArrayList<>() ;
            }
            buckets[count].add(temp.getKey());
        }
        int[] result = new int [k];
        int resultCount = 0;
        for (int i = buckets.length - 1 ; i > 0 ; i--){
            if (buckets[i] != null) {
                for (Integer num : buckets[i]){
                    if (resultCount == k){
                        return result;
                    }
                result[resultCount] = num;
                resultCount++;

                }
            }
        }   
        return result; 
    }
}
