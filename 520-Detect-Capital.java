class Solution {
    public boolean detectCapitalUse(String word) {
        boolean f=false;
        if(word.toUpperCase().equals(word))
        {
            f=true;
        }
        else if(word.toLowerCase().equals(word))
        {
            f=true;
        }
        else
        {
            if(word.charAt(0)<=90)
            {
            for(int i=1;i<word.length();i++)
            {
                if(word.charAt(i)>=97)
                {
                    f=true;
                }
                else
                {
                    f=false;
                    break;
                }
            }

            }
        }
      return f;  
    }
}