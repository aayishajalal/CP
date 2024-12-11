class Solution {
       public int maximumBeauty(int[] A, int k) {
        Arrays.sort(A);
        int i = 0, j, n = A.length;
        for (j = 0; j < n; ++j)
            if (A[j] - A[i] > k * 2)
                i++;
        return j - i;
    }
}