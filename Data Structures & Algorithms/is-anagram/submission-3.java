class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        Map<Character, Integer> charMap = new HashMap<>();

        for(char c : s.toCharArray()){
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for(char cc : t.toCharArray()){
            if(!charMap.containsKey(cc))
                return false;

            charMap.put(cc, charMap.get(cc) - 1);
            if(charMap.get(cc) == 0)
                charMap.remove(cc);
        }

        return charMap.isEmpty();
    }
}
