class Solution {
    public int maxVowels(String s, int k) {
        byte[] arr = new byte[123];
        byte[] str = new byte[s.length()];
        s.getBytes(0,s.length(),str,0);
        arr['a'] = arr['i'] = arr['o'] = arr['e'] = arr['u'] = 1;
        int cnt = 0;
        int end = 0;
        int start = 0;
        int max = 0;
        while(end < k)
        cnt += arr[str[end++]];
        max = cnt;
        while(end < str.length){
            cnt += arr[str[end++]] - arr[str[start++]];
            if(max < cnt)
            max = cnt;
        }
        return max;
    }
}