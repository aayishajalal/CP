class Solution {
    public boolean checkString(String s) {
        char[] a = s.toCharArray();
        char[] b = Arrays.copyOf(a, a.length);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}