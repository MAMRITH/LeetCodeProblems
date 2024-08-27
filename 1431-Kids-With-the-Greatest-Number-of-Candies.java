class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>list=new ArrayList<Boolean>();
        int tot=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }
        for(int x:candies)
        {
            if(x+extraCandies>=max)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
      return list;  
    }
}