class Solution {
    public int minimumDifference(final int[] nums, final int k) {
        final int n = nums.length;

        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n - k + 1; ++i)
            min = Math.min(min, nums[i + k - 1] - nums[i]);

        return min;
    }
}