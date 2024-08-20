class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String i:operations)
        {
            switch(i)
            {
                case "X++":
                    {
                        x+=1;
                        break;
                    }
                case "++X":
                    {
                        x+=1;
                        break;
                    }
                case "X--":
                    {
                        x-=1;
                        break;
                    }
                case "--X":
                    {
                        x-=1;
                        break;
                    }
            }
        }
       return x; 
    }
}