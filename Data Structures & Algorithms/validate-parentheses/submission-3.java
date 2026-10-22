class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (Character c : s.toCharArray()){
            if(map.containsKey(c)){ //is a closing bracket, look at the top of the stack. if its the keys value pop int 
            if(stack.isEmpty() || stack.pop() != map.get(c)){
                    return false;
                }
            }
            else {
            stack.push(c);
            }
        }
        return stack.isEmpty();
        }
    }
