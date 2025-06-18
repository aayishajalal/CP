class Solution {
    public int myAtoi(String s) {
    int i = 0, n = s.length();
    int sign = 1;
    long result = 0;

    // 1. Skip whitespaces
    while (i < n && s.charAt(i) == ' ') i++;

    // 2. Handle optional '+' or '-'
    if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
        sign = (s.charAt(i) == '-') ? -1 : 1;
        i++;
    }

    // 3. Process digits
    while (i < n && Character.isDigit(s.charAt(i))) {
        int digit = s.charAt(i) - '0';
        result = result * 10 + digit;

        // 4. Clamp to int range
        if (sign * result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (sign * result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;

        i++;
    }

    return (int)(sign * result);

    }
}