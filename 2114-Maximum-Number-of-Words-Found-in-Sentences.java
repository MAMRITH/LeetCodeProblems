class Solution {
    public int mostWordsFound(String[] arr) {
        int max = -1;
        int n = arr.length;
        for(int i=0; i<n; i++){
            max = Math.max(max,arr[i].split(" ").length);
        }
        return max;
    }
}