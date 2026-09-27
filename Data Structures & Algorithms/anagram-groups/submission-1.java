class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>(); //initialize a map where the key is the sorted string and the value is an array of strings (the anagrams)

        for (int i = 0; i < strs.length ; i++) { //Go through the array of strings
            String currWordSort = sorting(strs[i]);
            map.computeIfAbsent(currWordSort, k -> new ArrayList<>()).add(strs[i]);
            }
        return new ArrayList<>(map.values());
    }

    private static String sorting (String word) {  //turn the word to a character array, sort array, and turn it back to a string and return it
        char[] sortedWordAr = word.toCharArray();
        Arrays.sort(sortedWordAr);
        String sortedWord = new String(sortedWordAr);
        return sortedWord;
    }

}
