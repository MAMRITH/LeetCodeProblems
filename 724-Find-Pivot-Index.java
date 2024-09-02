class Solution {
    public int pivotIndex(int[] nums) {
        int Left=0;
        int Right=0;
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                Right+=nums[j];
            }
            for(int k=i-1;k>=0;k--)
            {
                Left+=nums[k];
            }
            if(Left==Right)
            {

                return i;
            }
            else
            {
                Right=0;
                Left=0;
            }
        }
      return -1;  
    }
}