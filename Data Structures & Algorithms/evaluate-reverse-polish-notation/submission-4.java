class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        Set <String> operands = new HashSet<>();
        operands.add("+");
        operands.add("-");
        operands.add("*");
        operands.add("/");       
        for (String c : tokens){
            if (operands.contains(c)){
                int val2 = stack.pop();
                int val1 = stack.pop();
                if (c.charAt(0) == '+'){
                    int newVal = val1+val2;
                    stack.push(newVal);
                }
                else if (c.charAt(0) == '-'){
                    int newVal = val1 - val2;
                    stack.push(newVal);

                }
                else if (c.charAt(0) == '*'){
                    int newVal = val1 * val2;
                    stack.push(newVal);
                }
                else if (c.charAt(0) == '/'){
                    int newVal = val1 / val2;
                    stack.push(newVal);

                } 
            }
            else{
            stack.push(Integer.valueOf(c));
            }
        }
        return stack.peek();
    }
}
