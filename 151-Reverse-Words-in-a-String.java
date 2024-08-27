class Solution {
    public String reverseWords(String s) {
       // s.trim();
        String str="";
        String arr[]=s.trim().split("\\s+");
        for(int i=arr.length-1;i>=0;i--)
        {
            str+=" "+arr[i];
        }
         
    return str.trim(); 
    }
}