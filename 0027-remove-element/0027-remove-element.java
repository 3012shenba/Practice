class Solution {
    public int removeElement(int[] nums, int val) {
     ArrayList<Integer>cl=new ArrayList();
     int c=0;
     for(int i=0;i<nums.length;i++)
     {
        if(nums[i]!=val)
        {
           cl.add(nums[i]);
           c++;
        }
     }
     for(int i=0;i<cl.size();i++)
     {
       nums[i]= cl.get(i); 
       
     }
     return c;     

    }
}