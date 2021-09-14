class Solution {
    public int strStr(String haystack, String needle) {
        int size = needle.length();
        int hsize = haystack.length();
        if (size == 0 || needle == null || haystack.equals(needle))
            return 0;
             
        if (hsize < size)
            return -1;

        int pos = -1;
        for (int i=0; i<hsize; i++){
            int total = i+size;
            
            if (total > hsize)
                break;
                        
            String hsub = haystack.substring(i, total);
            if (hsub.equals(needle)){
                pos = i;
                break;
            }
        }
        
        if (pos == -1)
            return -1;
        
        return pos;
    }
}
