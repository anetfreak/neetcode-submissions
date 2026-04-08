class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length <= 1) {
            return numbers;
        }

        for(int i=0; i<numbers.length; i++) {

            int left = i+1; 
            int right = numbers.length - 1;
            int lookup = target - numbers[i];
            
            while(left <= right) {
                int mid = (left + (right - left) / 2);
                if(numbers[mid] < lookup) {
                    left = mid + 1;
                } else if(numbers[mid] > lookup) {
                    right = mid - 1;
                } else {
                    return new int[]{i+1, mid+1};
                }
            }
        }

        return new int[2];
    }
}
