class Solution 
{
    public int majorityElement(int[] nums)
    {
        int s=nums.length/2;
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            count=0;
           for(int j=i;j<nums.length;j++)
           {
                if(nums[i]==nums[j])
                {
                    count++;
                }
           }
           if(count>s)
           {
            max=nums[i];
           }
    
        }
        return max;
    }
        
} 