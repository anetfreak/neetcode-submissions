class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() <= 1) {
            return true;
        }

        char[] input = s.toLowerCase().toCharArray();
        int start = 0;
        int end = input.length - 1;

        while(start != end && start < end) {
            char first = input[start];
            char last = input[end];
            if(
                ((first >= '0' && first <= '9') || 
                (first >= 'a' && first <= 'z'))
                &&
                ((last >= '0' && last <= '9') || 
                (last >= 'a' && last <= 'z'))
            ) {
                if(first == last) {
                    start++; end--;
                } else {
                    return false;
                }
            } else {
                if (
                    !((first >= '0' && first <= '9') || 
                    (first >= 'a' && first <= 'z'))
                ) {
                    start++;
                } else if (
                    !((last >= '0' && last <= '9') || 
                    (last >= 'a' && last <= 'z'))
                ) {
                    end--;
                }
            }
        }

        return true;
    }
}
