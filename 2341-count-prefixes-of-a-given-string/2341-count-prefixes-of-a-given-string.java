import java.util.ArrayList;
import java.util.List;

class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String i : words)
            if (s.startsWith(i)) count++;
        return count;
    }
}