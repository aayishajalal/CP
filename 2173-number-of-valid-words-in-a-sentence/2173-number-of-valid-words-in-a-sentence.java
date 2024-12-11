class Solution {
    public int countValidWords(String sentence) {
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (isWordValid(word)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isWordValid(String word) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String punctuation = "!.,";
        if (word.isEmpty()) {
            return false;
        }

        if (word.length() == 1 && punctuation.indexOf(word.charAt(0)) > -1) {
            return true;
        }
        
        if (letters.indexOf(word.charAt(0)) == -1 || word.charAt(0) == '-') {
            return false;
        }

        if (letters.indexOf(word.charAt(word.length() - 1)) == -1 && punctuation.indexOf(word.charAt(word.length() - 1)) == -1) {
            return false;
        }
        
        if (word.length() > 1 && word.charAt(word.length() - 2) == '-' && punctuation.indexOf(word.charAt(word.length() - 1)) > -1) {
            return false;
        }

        int countHyphen = 0;
        for (int i = 1; i < word.length() - 1; i++) {
            char ch = word.charAt(i);
            if (ch == '-') {
                countHyphen++;
                if (countHyphen > 1) {
                    return false;
                }
            } else if (letters.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}