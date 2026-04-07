class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null) {
            return true;
        }

        if(s == null && t != null) { 
            return false;
        } else if(t == null && s != null) { 
            return false;
        }

        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> chars = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            chars.put(s.charAt(i), chars.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i=0; i<t.length(); i++) {
            int count = chars.getOrDefault(t.charAt(i), 0);
            if(count > 0) {
                chars.put(t.charAt(i), chars.get(t.charAt(i)) - 1);
                if(chars.get(t.charAt(i)) == 0) {
                    chars.remove(t.charAt(i));
                }
            } else {
                return false;
            }
        }

        if(chars.size() > 0) {
            return false;
        }

        return true;
    }
}
