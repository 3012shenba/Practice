class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        String cu="";
        for(int i=0;i<sentences.length;i++)
        {
            cu=sentences[i];
            String res[]=cu.split(" ");
            if(res.length>max)
            {
                max=res.length;
            }
        }
        return max;
    }
}