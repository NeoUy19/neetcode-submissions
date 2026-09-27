class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){ //Go through nums array, put the value and count how many times that number is seen
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1); //getOrDefault sets default to zero if that number is not in the map then adds one. If it is get its value and add one
        }
        
        List<Integer>[] buckets = new List[nums.length + 1];   // index = frequency; max freq is n
for (Map.Entry<Integer, Integer> temp : map.entrySet()){
    int count = temp.getValue();
    if (buckets[count] == null){                       // array starts all null
        buckets[count] = new ArrayList<>();            // create on first use
    }
    buckets[count].add(temp.getKey());                 // number in, count was the index
}
int[] result = new int[k];
int resultCount = 0;                                   // separate from i
for (int i = buckets.length - 1 ; i >= 0 ; i--){       // high freq to low
    if (buckets[i] != null) {                          // most buckets are empty
        for (int num : buckets[i]){                    // ties live in the same bucket
            if (resultCount == k){
                return result;                         // check here — a tie can overshoot
            }
            result[resultCount] = num;
            resultCount++;
        }
    }
}
return result;                                        
    }
}
