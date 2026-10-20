class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();
        
        for(Character c : s.toCharArray()){
            sMap.computeIfAbsent(c, k->0);
            sMap.put(c, sMap.getOrDefault(c,0)+1);
        }
        for (Character c:t.toCharArray()){
            tMap.computeIfAbsent(c, k->0);
            tMap.put(c, tMap.getOrDefault(c,0)+1);
        }
        return sMap.equals(tMap);
    }
}
