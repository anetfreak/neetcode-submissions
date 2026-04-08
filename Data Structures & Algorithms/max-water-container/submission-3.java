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
            int leftHeight = heights[left];
            int rightHeight = heights[right];
            int area = distance * Math.min(rightHeight, leftHeight);
            max = Math.max(area, max);

            if(leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
