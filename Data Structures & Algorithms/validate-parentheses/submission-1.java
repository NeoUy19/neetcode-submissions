class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')', '('); //fill map with closing parenthesis as key and opening as value because when a closing bracket it found you know that youre going to need to pop its corresponding opening
        map.put(']', '[');
        map.put('}', '{');
        for (char c : s.toCharArray()){
            if (map.containsKey(c)){ //is it a closer?
                if (stack.isEmpty() || stack.pop() != map.get(c)){
                    return false;
                }
            }else { //if its an opener
            stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
