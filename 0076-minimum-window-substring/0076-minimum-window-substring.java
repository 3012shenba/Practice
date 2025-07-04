class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        int[] count = new int[128];
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i)]++;
        }

        int required = t.length();  // number of chars we need to find
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        while (right < s.length()) {
            char rChar = s.charAt(right);
            // If this char is needed, decrement required count
            if (count[rChar] > 0) {
                required--;
            }
            // Decrement count for this char (may become negative)
            count[rChar]--;
            right++;

            // When all required chars are found
            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }

                char lChar = s.charAt(left);
                count[lChar]++;
                // If after incrementing count, it's > 0, means this char is needed again
                if (count[lChar] > 0) {
                    required++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
