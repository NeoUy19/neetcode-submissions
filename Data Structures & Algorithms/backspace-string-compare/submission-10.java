class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack = new ArrayDeque<>();
        Deque<Character> stack2 = new ArrayDeque<>();
        for(Character c : s.toCharArray()){
            if(c == '#'){
                if (!stack.isEmpty()){
                stack.pop();
                }
            }
            else {
                stack.push(c);
            }
        }

        for(Character c : t.toCharArray()){
            if(c == '#'){
                if (!stack2.isEmpty()){
                stack2.pop();
                }
            }
            else {
                stack2.push(c);
            }
        }
        // if (!stack.isEmpty()){
        //     if (stack.peekFirst() == '#'){
        //     stack.pollFirst();}
        // }
        // if (!stack2.isEmpty() && stack2.peekFirst() == '#'){
        //      if (stack2.peekFirst() == '#'){
        //     stack2.pollFirst();}
        // }
        System.out.println(stack.size() + " " + stack2.size());
       if(stack.size() != stack2.size()){
        return false;
       }
       else{
        for (Character c : stack){
            if (stack.pop() == stack2.pop()){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
       }
    }
}
