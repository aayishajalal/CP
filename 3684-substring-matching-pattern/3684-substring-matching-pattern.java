import java.util.regex.*;

class Solution {
    public boolean hasMatch(String s, String p) {
        p = p.replace("*", ".*");
        Pattern pattern = Pattern.compile(p);
        Matcher m = pattern.matcher(s);
        return m.find();
    }
}