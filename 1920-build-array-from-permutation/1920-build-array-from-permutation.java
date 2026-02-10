class Solution {
    public int[] buildArray(int[] nums) {
        int res[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            res[k++]=nums[nums[i]];
        }
        return res;
    }
}