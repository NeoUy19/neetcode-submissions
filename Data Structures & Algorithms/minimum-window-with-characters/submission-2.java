class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        int leftPtr = 0;
        int shortestSubstring = Integer.MAX_VALUE;
        int satisfiedSize = 0;
        int bestStartIndex = 0;
        for (int i = 0 ; i < t.length() ; i++){
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }
        int requiredSize = need.size();

        for (int i = 0 ; i < s.length() ;i++){
            need.put(s.charAt(i), need.getOrDefault(s.charAt(i), 0) -1);
            if (need.get(s.charAt(i)) == 0){
                satisfiedSize++;
            }
            while (satisfiedSize == requiredSize){
                if (i - leftPtr + 1 < shortestSubstring){
                    shortestSubstring = i - leftPtr+1;
                    bestStartIndex = leftPtr;
                }
                if (need.get(s.charAt(leftPtr)) == 0){
                    satisfiedSize--;
                }
                need.put(s.charAt(leftPtr), need.getOrDefault(s.charAt(leftPtr), 0)+1);
                leftPtr++;
            }
        }
        return shortestSubstring == Integer.MAX_VALUE
            ? ""
            : s.substring(bestStartIndex, bestStartIndex + shortestSubstring);
    }
}
