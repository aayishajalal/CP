class Solution {
    public int percentageLetter(String s, char letter) {
        int n = s.length();
        int cnt = 0;
        for (int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if (ch == letter) cnt += 1;
        }

        return (int)Math.floor((double)(cnt*100)/n);
    }
}