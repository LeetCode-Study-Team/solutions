class Solution {
    public boolean isAnagram(String s, String t) {
        if (t.length() < s.length())
            return false;
        
        int [] checker_s = new int[26];
        int [] checker_t = new int[26];
        int counter = 0, counter_same = 0;
        
        for (int c=0; c<s.length(); c++){
            int idx = s.charAt(c) - 'a';
            checker_s[idx]++;
        }
        
        for (int c=0; c<t.length(); c++){
            int idx = t.charAt(c) - 'a';
            checker_t[idx]++;
        }
        
        for (int c=0; c<26; c++){
            if (checker_s[c] != checker_t[c]){
                if (checker_s[c] > 0 || checker_t[c] > 0){
                    counter++;
                }
            }
            else if (checker_s[c] == checker_t[c]){
                if (checker_s[c] > 0 && checker_t[c] > 0)
                    counter_same++;       
            }
        }
        
        boolean result = false;
        if (counter == 0 && counter_same > 0)
            result = true;
                
        return result;
    }
}
