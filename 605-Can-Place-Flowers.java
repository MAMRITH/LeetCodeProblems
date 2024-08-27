class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
        {
            return true;
        }
        if(flowerbed.length==1)
        {
            if(flowerbed[0]==0)
            {
                n-=1;
            }
        }
            else  {
        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i]==0)
            {
                if(i==0)
                {
                    if(flowerbed[i+1]==0)
                    {
                        n-=1;
                        i++;
                        if(n==0)
                        {
                            break;
                        }
                        continue;
                    }
                }
                if(i==flowerbed.length-1)
                {
                    if(flowerbed[i-1]==0)
                    {
                        n-=1;
                        i++;
                        if(n==0)
                        {
                            break;
                        }
                        continue;
                    }
                }
                if(flowerbed[i+1]==0&&0==flowerbed[i])
                {
                    n-=1;
                    i++;
                    if(n==0)
                    {
                        break;
                    }
                }
            }
            else
            {
                i++;
            }
        }
        }
     return n==0? true:false;   
    }
}