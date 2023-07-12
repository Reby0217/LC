class Solution {
    public int longestPalindrome(String s) {
        int len = 0;
        HashSet<Character> hset = new HashSet<Character>();
        for (int i = 0; i< s.length(); i++) {
            char c = s.charAt(i);
            if (hset.contains(c)) {
                len += 2;
                hset.remove(c);
            } else {
                hset.add(c);
            }
        }
        if (hset.size() > 0) {
            len++;
        }
        return len;
        
    }
}