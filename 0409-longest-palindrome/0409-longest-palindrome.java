class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[123]; // Assuming ASCII characters
        
        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        
        int maxLength = 0;
        boolean hasOddFreq = false;
        
        // Iterate over the frequency array
        for (int count : freq) {
            maxLength += count / 2 * 2; // Add even count to the palindrome length
            if (count % 2 == 1) {
                hasOddFreq = true;
            }
        }
        
        // If there's at least one character with an odd frequency, add 1 to the length
        if (hasOddFreq) {
            maxLength++;
        }
        
        return maxLength;
    }
}