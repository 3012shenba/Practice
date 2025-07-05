class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
     {
        int n1=nums1.length;
        int n2=nums2.length;
        int res[]=new int[n1+n2];
        int k=0;
        for(int i=0;i<n1;i++)
        {
            res[k]=nums1[i];
            k++;
        }
        for(int j=0;j<n2;j++)
        {
            res[k]=nums2[j];
            k++;
        }
        Arrays.sort(res);
        
        if(res.length%2==0)
        {
            return (res[res.length/2-1]+res[res.length/2])/2.0;
        }
        else
            return (res[res.length/2]); 
    }
}