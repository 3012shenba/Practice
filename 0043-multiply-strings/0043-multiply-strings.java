import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger x=new BigInteger(num1);
        BigInteger y=new BigInteger(num2);
        BigInteger mul=x.multiply(y);
        String ans="";
        ans+=mul;
        return ans;
    }
}