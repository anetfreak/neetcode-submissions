class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 1) {
            return new int[]{};
        }

        int i=0;
        while(i < nums.length) {
            int lookup = target - nums[i];
            for(int j=i+1; j<nums.length; j++) {
                if(lookup == nums[j]) {
                    return new int[]{i, j};
                }
            }
            i++;
        }
        return new int[]{};
    }
}
