package yoochulkim;

import java.util.ArrayList;
import java.util.List;

// 242번 Valid Anagram 문제 솔루션
public class S0242 {
    // 투두
    public static void main(String[] args) {
        String s1 = "anagram", t1 = "nagaram";
        String s2 = "rat", t2 = "car";
        String s3 = "a", t3 = "ab";
        String s4 = "aacc", t4 = "ccac";

        S0242 s0242 = new S0242();
        System.out.println(s0242.isAnagram1(s1, t1)); // true
        System.out.println(s0242.isAnagram1(s2, t2)); // false
        System.out.println(s0242.isAnagram1(s3, t3)); // false
        System.out.println(s0242.isAnagram1(s4, t4)); // false
    }

    /**
     * 결과
     * Runtime: 330 ms, faster than 5.18% of Java online submissions for Valid Anagram.
     * Memory Usage: 39.7 MB, less than 42.21% of Java online submissions for Valid Anagram.
     */
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // s의 인덱스를 움직이며, 얻은 레터를 t의 모든 레터와 비교해 같은게 있다면,
        // t의 해당 레터를 제거 후, s의 다음 인덱스를 진행한다.
        for (int i = 0; i < s.length(); i++) {
            int sameLetterLocation = t.indexOf(s.charAt(i));
            if (sameLetterLocation != -1) {
                t = t.substring(0, sameLetterLocation) + t.substring(sameLetterLocation + 1);
            } else {
                return false;
            }
        }

        // 위에 for 문을 지났다면, 모든 레터가 같은
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        List<Character> t_chars = convertStringToCharList(t);

        for (int i = 0; i < s.length(); i++) {
            boolean isLetterSame = false;
            for (int j = 0; j < t_chars.size(); j++) {
                if (s.charAt(i) == t_chars.get(j)) {
                    isLetterSame = true;
                    t_chars.remove(j);
                    break;
                }
            }
            if (!isLetterSame) {
                return false;
            }
        }

        return true;
    }

    private List<Character> convertStringToCharList(String str) {
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }
}
