class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0;
        Set<Character> seenChars = new HashSet<>();
        int currCount = 0;
        int leftPointer = 0 ;
        for (int i = 0 ; i < s.length(); i++){
            while (seenChars.contains(s.charAt(i))) {
    seenChars.remove(s.charAt(leftPointer));
    leftPointer++;
}
seenChars.add(s.charAt(i));
longestSubstring = Math.max(longestSubstring, i - leftPointer + 1);
            }
        return longestSubstring;
    }
}
