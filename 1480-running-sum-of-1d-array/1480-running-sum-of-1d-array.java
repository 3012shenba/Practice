class Solution {
    public int[] runningSum(int[] nums) 
    {
       int runningsum[]=new int[nums.length];
       int k=0;
       int sum=0;
       for(int i=0;i<nums.length;i++)
       {
        sum=0;
           int res[]=Arrays.copyOfRange(nums,0,i+1);
           for(int j=0;j<res.length;j++)
           {
            sum+=res[j];
           }
           runningsum[k++]=sum;
       } 
       return runningsum;
    }
}