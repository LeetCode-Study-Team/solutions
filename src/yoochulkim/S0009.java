package yoochulkim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 문제: 9. Palindrome Number
 * 설명: 거꾸로 해도 같은 숫자 찾기
 */
public class S0009 {
    public static void main(String[] args) {
        int trueInput1 = 121; // true
        int trueInput2 = 32423; // true

        int falseInput1 = -121;
        int falseInput2 = 344;

        S0009 s0009 = new S0009();

        /*System.out.println(s0009.isPalindrome1(trueInput1));
        System.out.println(s0009.isPalindrome1(trueInput2));

        System.out.println(s0009.isPalindrome1(falseInput1));
        System.out.println(s0009.isPalindrome1(falseInput2));*/

        System.out.println(s0009.best_answer_isPalindrome(trueInput2));
    }


    /**
     * -모범 답안-
     * 토론: 내 풀이와 똑같이 reverse를 하여 값을 비교하였다. 다르게, 나는 list를 이용하였다.
     * 원시 타입을 이용하는게 빠르고 데이터도 적게 쓰는것 같다.
     *
     * Runtime: 7 ms, faster than 70.64% of Java online submissions for Palindrome Number.
     * Memory Usage: 38.3 MB, less than 70.63% of Java online submissions for Palindrome Number.
     */
    public boolean best_answer_isPalindrome(int num){
        if(num < 0) return  false;
        int reversed = 0, remainder, original = num;
        while(num != 0) {
            remainder = num % 10; // reversed integer is stored in variable
            reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
            num  /= 10;  //the last digit is removed from num after division by 10.
        }
        // palindrome if original and reversed are equal
        return original == reversed;
    }

    /**
     * 내풀이
     * 설명: 리스트에 넣고 뒤집은 것도 새로운 리스트에 넣어 두개가 같은지 비교
     *
     * Runtime: 14 ms, faster than 24.52% of Java online submissions for Palindrome Number.
     * Memory Usage: 38.5 MB, less than 50.49% of Java online submissions for Palindrome Number.
     */
    public boolean my_isPalindrome(int x) {
        if (x < 0) { // 음수일 경우 경우 무조건 false 반환
            return false;
        }

        List<Integer> digits = divideIntToDigits(x);
        List<Integer> reversedDigits = new ArrayList<>(digits);

        Collections.copy(reversedDigits, digits);
        Collections.reverse(reversedDigits);

        return digits.equals(reversedDigits);
    }

    /**
     *  int의 각 자리수를 리스트로 쪼갠다.
     */
    private List<Integer> divideIntToDigits(int x) {
        List<Integer> digits = new ArrayList<Integer>();
        while (x > 0) {
            digits.add(x % 10);
            x /= 10;
        }
        Collections.reverse(digits);
        return digits;
    }
}
