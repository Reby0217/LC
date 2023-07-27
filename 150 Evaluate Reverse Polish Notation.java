class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int a,b;
        for (String s: tokens) {
            switch (s) {
                case "+":
                    stk.add(stk.pop()+ stk.pop());
                    break;
                case "*":
                    stk.add(stk.pop()* stk.pop());
                    break;
                case "-":
                    a = stk.pop();
                    b = stk.pop();
                    stk.add(b-a);
                    break;
                case "/":
                    a = stk.pop();
                    b = stk.pop();
                    stk.add(b/a);
                    break;
                default:
                    stk.add(Integer.parseInt(s));
            }
        }
        return stk.pop();
    }
}