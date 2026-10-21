class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] newArray = s.toCharArray() ;
        while(i < j){
            while (i < j && !Character.isLetterOrDigit(newArray[i])){
                i++;
            }
             while (i < j &&!Character.isLetterOrDigit(newArray[j])){
                j--;
            }
             if (Character.toLowerCase(newArray[i]) != Character.toLowerCase(newArray[j])){
                return false;
            }
            
            i++;
            j--;
    }
        return true;
    }
}
