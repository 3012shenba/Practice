class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int esum=(n*(n+1))/2;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        return esum-sum;
    }
}