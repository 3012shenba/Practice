class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.trim().split(" ");
        int len=0;
        for(int i=0;i<arr.length;i++)
        {
            len=arr[arr.length-1].length();
        }
        return len;
    }
}