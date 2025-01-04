class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] arr = new int[26];
        for (char u : s.toCharArray()) {
            arr[u - 'a']++;
        }
        int[] freq = new int[26];
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i) - 'a';
            arr[t]--;
            for (int j = 0; j < 26; j++) {
                if (freq[j] > 0 && arr[j] > 0) {
                    set.add(26 * t + j);
                }
            }
            freq[t]++;
        }

        return set.size();
    }
}