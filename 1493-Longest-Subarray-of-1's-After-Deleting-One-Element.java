class Solution {
    public int longestSubarray(int[] nums) {
        int leftLen = 0, rightLen = 0, pos = 0, max = 0;
        
        while (pos < nums.length) {
            //Left subarray increases
            if (nums[pos] == 1) {
                ++pos;
                ++leftLen;
            }
            else if (nums[pos] == 0) {
                rightLen = 0;
                ++pos;
                
                //Find out size of right subarray.
                while (pos < nums.length && nums[pos] == 1) {
                    ++pos;
                    ++rightLen;
                }
                max = Math.max(max, leftLen + rightLen);
                leftLen = rightLen;
            }
        }
        if (leftLen == nums.length)
            max = nums.length-1;
        
        return max;
    }
}