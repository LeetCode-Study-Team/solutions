package yoochulkim;

/**
 * 28. Implement strStr
 */
public class S0028 {

    public static void main(String[] args) {
        String haystack1 = "hello", needle1 = "ll";
        String haystack2 = "aaaaa", needle2 = "bba";
        String haystack3 = "", needle3 = "";

        System.out.println(strStr(haystack1, needle1)); // 2
        System.out.println(strStr(haystack2, needle2)); // -1
        System.out.println(strStr(haystack3, needle3)); // 0
    }


    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) { // 아무 값이 없을때 0 리턴
            return 0;
        }


        return -1;
    }
}
