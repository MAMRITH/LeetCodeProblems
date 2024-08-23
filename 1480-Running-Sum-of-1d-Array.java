class Solution {
    public int[] runningSum(int[] nums) {
       int arr[]=new int[nums.length];
       int tot=0;
       for(int i=0;i<nums.length;i++) 
       {
        tot+=nums[i];
        arr[i]=tot; 
       }
       return arr;
    }
}