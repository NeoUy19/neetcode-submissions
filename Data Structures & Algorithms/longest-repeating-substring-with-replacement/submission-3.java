class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int longestLen = 0;
        int longestFreq = 0;
        int leftPtr = 0;
        for (int i = 0 ; i < s.length() ; i++){
            count[s.charAt(i) - 'A']++;
            longestFreq = Math.max(longestFreq, count[s.charAt(i) - 'A']);
            while (i - leftPtr + 1 - longestFreq > k){
                count[s.charAt(leftPtr)- 'A']-- ;
                leftPtr++;
            }
            longestLen = Math.max(longestLen, i - leftPtr + 1);
        }
        return longestLen;
    }
}
