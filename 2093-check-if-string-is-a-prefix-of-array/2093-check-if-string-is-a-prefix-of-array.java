class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            builder.append(words[i]);

            if (s.equals(builder.toString()))
                return true;
        }

        return false;
    }
}