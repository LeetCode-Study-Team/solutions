class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        
        String s1="", s2="";
        int len = num.length();
        for (int c=0; c<len; c++) {
        	s1 += num.charAt(c);
        	s2 += num.charAt(len - 1 - c);
        }
        
        return (s1.equals(s2));
    }
}
