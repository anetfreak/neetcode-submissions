class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) {
            return nums.length;
        }       

        Set<Integer> uniques = new HashSet<>();
        for(int n : nums) {
            uniques.add(n);
        }

        int max = 1;
        for(int n : nums) {
            int count = 1;
            if(uniques.contains(n - 1)) {
                continue;
            } else {
                int i=1;
                while(uniques.contains(n + i)) {
                    count++;
                    max = Math.max(max, count);
                    i++;
                }
            }
        }

        return max;
    }
}
