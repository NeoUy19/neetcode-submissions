class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapped = new HashMap<>();
        for (String word : strs){
            char[] sort = word.toCharArray();
            Arrays.sort(sort);
            String sorted = new String(sort);
            mapped.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(mapped.values());
    }
}
