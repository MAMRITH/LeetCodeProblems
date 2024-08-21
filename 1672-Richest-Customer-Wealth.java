class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=0;
        int tot=0;
        int row=accounts.length;
        int cow=accounts[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cow;j++)
            {
                tot+=accounts[i][j];
            }
            if(tot>=n)
            {
                n=tot;
            }
            tot=0;
        }
      return n;  
    }
}