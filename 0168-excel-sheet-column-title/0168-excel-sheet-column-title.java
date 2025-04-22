public class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        
        // Loop until the column number becomes 0
        while (columnNumber > 0) {
            // Subtract 1 to shift the numbering to 0-based (A=0, B=1, ..., Z=25)
            columnNumber--;
            
            // Find the remainder when divided by 26 (this gives us the current letter)
            int remainder = columnNumber % 26;
            
            // Convert the remainder to the corresponding letter ('A' + remainder)
            result = (char) (remainder + 'A') + result;  // Prepend the letter to the result string
            
            // Update columnNumber by dividing by 26 (move to the next "place")
            columnNumber /= 26;
        }
        
        return result;  // Return the final column title
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.convertToTitle(1));    // Output: "A"
        System.out.println(solution.convertToTitle(28));   // Output: "AB"
        System.out.println(solution.convertToTitle(701));  // Output: "ZY"
        System.out.println(solution.convertToTitle(52));   // Output: "AZ"
    }
}
