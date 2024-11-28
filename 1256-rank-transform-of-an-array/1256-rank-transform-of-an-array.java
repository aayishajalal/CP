class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return new int[]{};
        
        int[][] temp = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            temp[i][0] = arr[i];
            temp[i][1] = i;
        }

        Arrays.sort(temp, Comparator.comparingInt(a -> a[0]));

        int rank = 1;
        arr[temp[0][1]] = rank;

        for (int i = 1; i < temp.length; i++) {
            if (temp[i][0] != temp[i - 1][0]) {
                rank++;
            }
            arr[temp[i][1]] = rank;
        }

        return arr;
    }
}