class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        String ss=s.replace("0","m").replace("1","0").replace("m","1");
        return Integer.parseInt(ss,2);
        
    }
}