class Solution {
    public int maxArea(int[] heights) {
        if (heights == null || heights.length < 2) {
            return 0;
        }
        
        int max = 0;
        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            int distance = right - left;
            int area = distance * Math.min(heights[right], heights[left]);
            max = Math.max(area, max);

            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
