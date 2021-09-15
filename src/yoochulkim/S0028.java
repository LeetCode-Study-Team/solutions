package yoochulkim;

/**
 * 28. Implement strStr
 */
public class S0028 {

    public static void main(String[] args) {
        String haystack1 = "hello", needle1 = "ll";
        String haystack2 = "aaaaa", needle2 = "bba";
        String haystack3 = "", needle3 = "";

        System.out.println(strStr1(haystack1, needle1)); // 2
        System.out.println(strStr1(haystack2, needle2)); // -1
        System.out.println(strStr1(haystack3, needle3)); // 0
    }

    // 이렇게 해되 되나...?
    public static int strStr1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
