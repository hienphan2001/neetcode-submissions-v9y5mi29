class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> hm = new HashMap<>();
        hm.put('}', '{');
        hm.put(')', '(');
        hm.put(']', '[');

        StringBuilder result = new StringBuilder(s);

        for (char c : s.toCharArray()) {
            if (isOpenBracket(c)) {
                stack.push(c);
            } else if (!stack.isEmpty() && hm.get(c) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        
        return false;
    }   

    public boolean isOpenBracket(char c) {
        return (c == '{' || c == '[' || c == '(');
    }
}
