class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        for(int i=0;i<indices.length;i++) {
            incrow(ans,indices[i][0]);
        }
        for(int i=0;i<indices.length;i++) {
            inccol(ans,indices[i][1]);
        }
        int odd = cal(ans);
        return odd;
    }
    static int cal(int[][] ans) {
        int count=0;
        for(int i=0;i<ans.length;i++) {
            for(int j=0;j<ans[i].length;j++) {
                if(ans[i][j]%2!=0) {
                    count++;
                }
            }
        }
        return count;
    }
    static void incrow(int[][] ans, int row) {
        for(int i=0;i<ans.length;i++) {
            for(int j=0;j<ans[i].length;j++) {
                if(i==row) {
                    ans[i][j]++;
                }
            }
        }
    }
    static void inccol(int[][] ans, int col) {
        for(int i=0;i<ans.length;i++) {
            for(int j=0;j<ans[i].length;j++) {
                if(j==col) {
                    ans[i][j]++;
                }
            }
        }
    }
}