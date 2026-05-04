class Solution {
    public boolean isValid(String input) {
        HashMap<Character, Character> hs = new HashMap<>();
        hs.put('}', '{');
        hs.put(']', '[');
        hs.put(')', '(');

        Stack<Character> stack = new Stack();
        char[] charArr = input.toCharArray();
        stack.push(input.charAt(0));

        for(char ch : charArr) {
            if(stack.peek() == hs.get(ch))
                stack.pop();
            else
                stack.push(ch); 
        }

        return stack.size() == 1;
    }
}
