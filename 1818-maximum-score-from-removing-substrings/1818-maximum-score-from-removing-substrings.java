class Solution {
    public int maximumGain(String s, int x, int y) {
        String highPair = (x > y) ? "ab" : "ba";
        String lowPair = (x > y) ? "ba" : "ab";
        int highScore = Math.max(x, y);
        int lowScore = Math.min(x, y);

        Stack<Character> stack1 = new Stack<>();
        int score = 0;

        // Step 1: Remove high priority pair
        for (char c : s.toCharArray()) {
            if (!stack1.isEmpty() && stack1.peek() == highPair.charAt(0) && c == highPair.charAt(1)) {
                stack1.pop();
                score += highScore;
            } else {
                stack1.push(c);
            }
        }

        // Step 2: Remove low priority pair from stack1 contents
        Stack<Character> stack2 = new Stack<>();
        while (!stack1.isEmpty()) {
            char ch = stack1.pop();
            if (!stack2.isEmpty() && ch == lowPair.charAt(0) && stack2.peek() == lowPair.charAt(1)) {
                stack2.pop();
                score += lowScore;
            } else {
                stack2.push(ch);
            }
        }

        return score;
    }
}
