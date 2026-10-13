class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0;
        Set<Character> seen = new HashSet<>();
        int leftPtr = 0;
        for(int i = 0 ; i < s.length() ; i++){
            while (seen.contains(s.charAt(i))){
                seen.remove(s.charAt(leftPtr));
                leftPtr++;
            }
            seen.add(s.charAt(i));
            longestSubstring = Math.max(longestSubstring, i - leftPtr + 1);
        }
        return longestSubstring;
    }
}
