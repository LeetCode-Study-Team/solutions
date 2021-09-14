class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int c=0; c<nums.length; c++){
            for (int d=c+1; d<nums.length; d++){                    
                if (target == nums[c] + nums[d]){
                    return new int[]{c,d};
                }                    
            }
        }
        return new int[]{};
    }
}
