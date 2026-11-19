class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            int k = s.indexOf(s.charAt(j), i);
            if (k < j)
                i = k + 1;
            if (j - i + 1 > max)
                max = j - i + 1;
        }
        return max;
    }
}