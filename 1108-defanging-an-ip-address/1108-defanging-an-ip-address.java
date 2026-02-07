class Solution {
    public String defangIPaddr(String address) {
        String defangIPaddr="";
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            {
                defangIPaddr+="[.]";
            }
            else
            {
            defangIPaddr+=address.charAt(i);
            };
        }
        return defangIPaddr;
    }
}