class Solution {
    public boolean isValid(String s) {

         Map<Character, Character> paranthesesMap = new HashMap<>();
        paranthesesMap.put( '}', '{');
        paranthesesMap.put( ']', '[');
        paranthesesMap.put( ')', '(');

        Stack<Character> stack = new Stack<>();
        char[] strArr = s.toCharArray();
        stack.push(strArr[0]);
        int length = strArr.length;

        for(int a = 1; a < length; a++) {
            if(!stack.isEmpty() && stack.peek().equals(paranthesesMap.get(strArr[a])))
                stack.pop();
            else
                stack.push(strArr[a]);
        }

        return stack.empty();
    }
}
