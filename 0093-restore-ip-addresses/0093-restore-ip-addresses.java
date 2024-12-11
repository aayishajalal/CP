class Solution {
    static int n;
    static String s;
    static LinkedList<String> segments;
    static ArrayList<String> result;

    private boolean valid(String segment) {
        int m = segment.length(); // storing the length of each segment
        if (m > 3) // each segment's length should be less than or equal to 3
            return false;
        /*
         * Check if the current segment is valid
         * for either one of the following conditions:
         * 1. Check if the current segment is less or equal to 255.
         * 2. Check if the length of the segment is 1. The first character of segment
         * can be `0` only if the length of the segment is 1.
         */
        return (segment.charAt(0) != '0') ? (Integer.valueOf(segment) <= 255) : (m == 1);
    }

    // This function will append the current list of segments to the list of
    // results.
    private void updateSegment(int currDot) {
        String segment = s.substring(currDot + 1, n);
        if (valid(segment)) { // if the segment is acceptable
            segments.add(segment); // add it to the list of segments
            // Utility function to concatenate the entries of the segments list
            // separated by the dot delimiter.
            String ip = String.join(".", segments);
            result.add(ip);
            segments.removeLast(); // remove the top segment
        }
    }

    private void backtrack(int prevDot, int dots) {
        /*
         * prevDot : the position of the previously placed dot
         * dots : number of dots to place
         */

        // The current dot currDot could be placed in
        // a range from prevDot + 1 to prevDot + 4.
        // The dot couldn't be placed after the last character in the string.
        int maxPos = Math.min(n - 1, prevDot + 4);
        for (int currDot = prevDot + 1; currDot < maxPos; currDot++) {
            String segment = s.substring(prevDot + 1, currDot + 1);
            if (valid(segment)) {
                segments.add(segment); // place dot
                // If all 3 dots are placed, add the solution to result
                if (dots - 1 == 0)
                    updateSegment(currDot);
                else
                    // Continue to place dots
                    backtrack(currDot, dots - 1);
                segments.removeLast(); // Remove the last placed segment
            }
        }
    }

    public List<String> restoreIpAddresses(String s) {
        n = s.length();
        this.s = s;
        // Creating empty lists for storing valid IP addresses,
        // and each segment of IP
        result = new ArrayList<>();
        segments = new LinkedList<>();
        backtrack(-1, 3);
        return result;
    }
}