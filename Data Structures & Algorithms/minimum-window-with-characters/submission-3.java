class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        int leftPtr = 0;

        for (int i = 0 ; i < t.length() ; i++){ //add each character of t to the need map
           need.put(t.charAt(i),need.getOrDefault(t.charAt(i), 0)+1);
        } 
        int required = need.size();
        int bestStartingIndex = 0; //variable to keep track of start window
        int shortestWindow = Integer.MAX_VALUE; //keep track of the shortest window
        int satisfied = 0; //updates only when a needed character is at <= 0
        for (int i = 0 ; i < s.length() ; i++){
            need.put(s.charAt(i),need.getOrDefault(s.charAt(i), 0) - 1);
            
            if (need.get(s.charAt(i)) == 0 ){
                satisfied++;
            }

            while (satisfied == required){ //shrinking left
                if (i - leftPtr+ 1 < shortestWindow){
                    shortestWindow = i - leftPtr + 1;
                    bestStartingIndex = leftPtr;
                }
                if (need.get(s.charAt(leftPtr)) == 0 ){
                    satisfied--;
                }
                need.put(s.charAt(leftPtr),need.getOrDefault(s.charAt(leftPtr), 0) + 1);
                leftPtr++;
            }
        }
        return shortestWindow == Integer.MAX_VALUE ? "" : s.substring(bestStartingIndex, bestStartingIndex + shortestWindow);
    }
}
