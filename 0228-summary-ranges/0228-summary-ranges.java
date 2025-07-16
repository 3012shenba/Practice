class Solution {
    public List<String> summaryRanges(int[] nums)
    {
    ArrayList<String>list=new ArrayList();
    for(int i=0;i<nums.length;i++)
    {
        int st=nums[i];
        while(i<nums.length-1&&nums[i+1]==nums[i]+1)
        {
            i++;
        }
        if(st==nums[i])
        {
            list.add(""+st);
        }
        else
        {
            list.add(""+st+"->"+nums[i]);
        }
        
    }
    return list;
    }
}