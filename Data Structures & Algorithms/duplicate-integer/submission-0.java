class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums == null || nums.length <= 1 ) {
            return false;
        }

        Map<Integer, Integer> uniques = new HashMap<>();
        for(int number: nums) {
            if(uniques.containsKey(number)) {
                return true;
            } else {
                uniques.put(number, 1);
            }
        }
        return false;
    }
}