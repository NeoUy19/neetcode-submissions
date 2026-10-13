class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int leftPtr = 0;
        int maxLength = 0;
        for (int i = 0 ; i < s.length() ; i++){
            count[s.charAt(i) - 'A']++;
            int maxFreq = 0;
            for (int j = 0 ; j < 26 ;j++){
                if (count[j] > maxFreq){
                    maxFreq = count[j];
                }
            }
            while (i - leftPtr - maxFreq + 1> k){
                count[s.charAt(leftPtr) - 'A']--;
                leftPtr++;
            }
            maxLength = Math.max(maxLength, i - leftPtr + 1);
        }
        return maxLength;
    }
}
