class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]!=val)
            {
                nums[k]=nums[x];
                k++;
            }
        }
        return k; 
        
    }
}