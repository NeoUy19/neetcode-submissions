class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] alpha = new int[26];
        for (int i = 0 ; i < s1.length() ;i++){
            alpha[s1.charAt(i) - 'a']++;
        }
        if (s2.length() < s1.length()){
                return false;
            }
        for(int i = 0 ; i < s2.length() ; i++){
            alpha[s2.charAt(i) - 'a']--;
            if (i >= s1.length()){
                alpha[s2.charAt(i-s1.length()) -'a']++;
            }
            if (i >= s1.length() -1){
                boolean allZero = true;
                for(int j = 0 ; j < alpha.length ; j++){
                    if (alpha[j] != 0){
                        allZero = false;
                    }
                }
                if (allZero == true){
                    return true;
                }
                
            }
        }
        return false;
    }
}
