class Solution {
    public boolean isValid(String s) {
        Stack<Character> leftParenth = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '{'|| c == '[') {
                leftParenth.push(c);
            } else {
                if (!leftParenth.isEmpty() && leftOf(c) == leftParenth.peek()) {
                    leftParenth.pop();
                } else {
                    return false;
                }
            }
        }
        return leftParenth.isEmpty();
    }

    char leftOf(char c) {
        if (c == ')') {
            return '(';
        } else if (c == '}') {
            return '{';
        } else {
            return '[';
        }
    }
}