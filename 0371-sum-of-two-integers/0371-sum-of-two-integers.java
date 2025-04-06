class Solution {
    public int getSum(int a, int b) {
        int c=a^b;
        int sum=0;
        int carry=a&b;
        if(carry==0)
            sum=c;
        else
            sum=c+(carry<<1);
        return sum;
    }
}