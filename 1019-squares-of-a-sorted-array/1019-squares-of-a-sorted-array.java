class Solution {
    public int[] sortedSquares(int[] nums) {
      int res[]=new int[nums.length];
      int ri=0;
      for(int i=0;i<nums.length;i++)
      {
        res[ri]=nums[i]*nums[i];
        ri++;
      } 
      Arrays.sort(res);
      return res;
    }
}