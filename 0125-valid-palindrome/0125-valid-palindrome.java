class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return isValidPalindrome(s,0);
    }

    private boolean isValidPalindrome(String s, int i){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1))return false;
        return isValidPalindrome(s,i+1);
    }
}