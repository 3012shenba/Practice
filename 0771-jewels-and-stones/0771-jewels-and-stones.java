class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        int count=0;
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<jewels.length();i++)
        {
            char c=jewels.charAt(i);
            list.add(c);
        }
        for(int i=0;i<stones.length();i++)
        {
            char c=stones.charAt(i);
            if(list.contains(c))
            {
                count++;
            }
        }
        return count;
    }
}