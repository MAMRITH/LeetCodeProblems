class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowedChars = new boolean[26];
        int length = allowed.length();
        for(int i=0;i<length;i++){
            allowedChars[allowed.charAt(i) - 'a'] = true;
        }
        length = words.length;
        int count = 0;
        for(int i=0;i<length;i++){
            if(checkChar(allowedChars,words[i])){
                count++;
            }
        }
        return count;
    }
    public boolean checkChar(boolean[] allowedChars, String s){
        int length = s.length();
        for(int i=0;i<length;i++){
            if(!allowedChars[s.charAt(i)-'a']){
                return false;
            }
        }
        return true;
    }
}