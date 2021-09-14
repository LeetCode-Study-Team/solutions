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

   /* public static int strStr2(String haystack, String needle) {
        if (needle.length() > haystack.length()) { // needle 길이가 더 클 경우 체크
            return -1;
        } else if (needle.isEmpty()) { // needle 이 비어있으면 무조건 haystack의 포지션 0으로 간주
            return 0;
        }

        int iterationNumber = calculateIterationNumber(haystack.length(), needle.length());

        for (int i = 0; i < iterationNumber; i++) { // 7 3
            String test = haystack.substring(i, i + needle.length());
            if (test.equals(needle)) {
                return i; // haystack 에서 needle 시작점 리턴
            }
        }

        return -1;
    }*/

}
