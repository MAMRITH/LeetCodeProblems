class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            index++;
            if(nums.length%index==0)
            {
                sum+=nums[i]*nums[i];
            }
        }
      return sum;  
    }
}