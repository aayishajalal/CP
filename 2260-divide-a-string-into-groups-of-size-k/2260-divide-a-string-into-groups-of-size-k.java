class Solution {
    public String[] divideString(final String s, final int k, final char fill) {
        final StringBuilder sb = new StringBuilder();
        final String[] result = new String[s.length() / k + (s.length() % k == 0 ? 0 : 1)];
        int idx = 0;

        for(int i = 0; i < s.length(); ++i) {
            sb.append(s.charAt(i));

            if((i + 1) % k == 0) {
                result[idx++] = sb.toString();
                sb.setLength(0);
            }
        }

        if(sb.length() > 0 && sb.length() < k) {
            for(int i = sb.length(); i < k; ++i)
                sb.append(fill);

            result[idx] = sb.toString();
        }

        return result;
    }
}