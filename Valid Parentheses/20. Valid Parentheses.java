
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<s.length();i++) {
            // Push opening brackets
            char ch=s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If stack is empty 
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }
    
}
