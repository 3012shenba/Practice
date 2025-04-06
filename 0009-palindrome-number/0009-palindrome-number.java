class Solution {
    public boolean isPalindrome(int x) {
       int copy=x;
       int res=0;
       if(x<0)
        return false;
       while(x!=0)
       {
        res=res*10+(x%10);
        x=x/10;
       } 
       if(res==copy)
            return true;
        else
            return false;
    }
}