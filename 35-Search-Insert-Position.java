class Solution {
    public int searchInsert(int[] nums, int target) {
        int out=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
               out=i;
               break;
            }
            else if(nums[i]>target)
            {
               out=i;
               break;
            }
            else if(nums.length-1==i)
            {
                out=i+1;
                break;
            }
        }
        return out;        
    }
}