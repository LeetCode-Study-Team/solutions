import java.util.*;

class Solution {
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public int climbStairs(int n){
        if (n <= 1)
            return 1;
        
        int answer = 0;
        for (int d=2; d>=1; d--){
            int rest = n - d;
            if (rest > 1){
                int result = 0;
                if (map.containsKey(rest))
                    result = map.get(rest);
                else{
                    result = climbStairs(rest);
                    map.put(rest, result);
                }
                answer += result;
            }
            else
                answer++;
            
        }
        return answer;
    }
}
