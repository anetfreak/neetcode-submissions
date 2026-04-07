class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // boundary conditions
        
        //Hashmap that maintains a word and all its anagrams
        // Eg. <"pots", ["tops", "stop"]>
        
        // Approach
        // Take each word, sort the letters alphabetically 
        // and check if the key is present in the Map. 
        // If yes, add it to values list. If not, create a new key.

        // Compile result as list of list of string based on the map
        List<List<String>> result = new ArrayList<>();
        
        if(strs == null || strs.length <= 1) {
            List<String> original = Arrays.asList(strs);
            result.add(original);
            return result;
        }

        Map<String, List<String>> anagrams = new HashMap<>();

        for(String word: strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String updatedWord = new String(chars);
            if(anagrams.containsKey(updatedWord)) {
                anagrams.get(updatedWord).add(word);
            } else { 
                List<String> list = new ArrayList<>();
                list.add(word);
                anagrams.put(updatedWord, list);
            }            
        }

        for(List<String> value : anagrams.values()) {
            result.add(value);
        }    

        return result;
    }
}
