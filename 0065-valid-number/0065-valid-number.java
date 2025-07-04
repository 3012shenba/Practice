class Solution {
    public boolean isNumber(String s) {
        s = s.trim(); 
        boolean hasNum = false;
        boolean hasDot = false;
        boolean hasE = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                hasNum = true; 
            } 
            else if (c == '.') {
               
                if (hasDot || hasE) return false;
                hasDot = true;
            }
            else if (c == 'e' || c == 'E') {
                
                if (!hasNum || hasE) return false;
                hasE = true;
                hasNum = false; 
            }
            else if (c == '+' || c == '-') {
               
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }
            else
            {
                return false;
            }
            
        }
        return hasNum; 
    }
}
