class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE;
        int index=0;
        int SameValue=0;
        for(int j=0;j<arrays.size();j++)
        {
            if(arrays.get(j).get(arrays.get(j).size()-1)>max)
            {
                    index=j;
                max=arrays.get(j).get(arrays.get(j).size()-1);
            }
        }
        for(int i=0;i<arrays.size();i++)
        {
            if(i==index)
            {
                continue;
            }
                if(arrays.get(i).get(0)<min)
                {
                    min=arrays.get(i).get(0);
                }
        }
        for(int i=0;i<arrays.size();i++)
        {
                if(arrays.get(i).get(0)<min2)
                {
                    index=i;
                    min2=arrays.get(i).get(0);
                }
        }
        for(int j=0;j<arrays.size();j++)
        {
            if(j==index)
            {
             
                continue;
            }
            if(arrays.get(j).get(arrays.get(j).size()-1)>max2)
            {
                max2=arrays.get(j).get(arrays.get(j).size()-1);
            }
        }

        return Math.abs(max-min)>=Math.abs(max2-min2)? Math.abs(max-min):Math.abs(max2-min2);
    }
}