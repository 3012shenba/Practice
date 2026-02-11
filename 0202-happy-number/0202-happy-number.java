class Solution {
    public boolean isHappy(int n)
    {
        HashSet<Integer>list=new HashSet<>();
        int sum=0;
        while(n!=1&&!list.contains(n))
        {
            list.add(sum);
             sum=0;
            
             while(n>0)
             {
                int d=n%10;
                sum+=d*d;
                n/=10;
             }
              n=sum;
        }
    return n==1;
        
    }
}