class Solution {
    public int largestAltitude(int[] gain) {
        int n=0;
        int max=0;
        for(int x:gain)
        {
            n+=x;
            if(n>max)
            {
                max=n;
            }
        }
     return max;   
    }
}