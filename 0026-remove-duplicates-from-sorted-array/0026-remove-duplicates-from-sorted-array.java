class Solution {
    public int removeDuplicates(int[] nums) {
        int ri=1;
       for(int i=1;i<=nums.length-1;i++)
       {
            if(nums[i]!=nums[i-1])
            {
                nums[ri]=nums[i];
                ri++;
            }
       }
       return ri;
    }
}