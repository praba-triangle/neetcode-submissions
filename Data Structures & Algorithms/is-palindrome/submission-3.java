class Solution {
    public boolean isPalindrome(String input) {
        if (input == null)
            return false;

        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int firstIndex = 0;
        int lastIndex = input.length() - 1;

        while (firstIndex < lastIndex) {
            if (input.charAt(firstIndex) != input.charAt(lastIndex)){
                return false;
            }
            firstIndex++;
            lastIndex--;
        }

        return true;
    }
}
