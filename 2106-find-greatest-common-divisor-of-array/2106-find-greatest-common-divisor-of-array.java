class Solution {
    public int findGCD(int[] nums) {
       int min=Integer.MAX_VALUE ;
       int max=Integer.MIN_VALUE;
       for(int num:nums)
       {
        if(num>max)
        {
            max=num;
        }
        if(num<min)
        {
            min=num;
        }
       }
       return gcd(min,max);
    }
    public static int gcd(int min,int max)
    {
       if(max==0)
        return min;
     return gcd(max,min%max);
    }
}