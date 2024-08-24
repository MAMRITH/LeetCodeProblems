class Solution {
    public int countAsterisks(String s) {
        int count=0;
        boolean f=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='|')
            {
                f=f==false? true:false;
            }
            if(f==false&&s.charAt(i)=='*')
            {
                count++;
            }
        }
      return count;  
    }
}