class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (res[0] == -1) {
                    res[0] = i;   // first index
                }
                res[1] = i;       // last index (always update)
            }
        }
        return res;
    }
}
