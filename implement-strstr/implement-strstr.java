class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        int nLength = needle.length();
        for(int i=0;i<haystack.length()-nLength+1;i++){
            if(haystack.substring(i,i+nLength).equals(needle)) return i;
        }
        return -1;
    }
}