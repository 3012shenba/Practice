class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ind=m;
        for(int j=0;j<n;j++)
        {
            nums1[ind]=nums2[j];
            ind++;   
        }
        Arrays.sort(nums1);
    }
}