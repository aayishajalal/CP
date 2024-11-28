

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String w : words) {
            StringBuilder reversed = new StringBuilder(w).reverse();
            String reversedStr = reversed.toString();
            if (map.getOrDefault(reversedStr, 0) > 0) {
                ans++;
                map.put(reversedStr, map.get(reversedStr) - 1);
            } else {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }
        
        return ans;
    }
}
