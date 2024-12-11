class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int n=ranges.length;
        for(int i=left;i<=right;i++)
        {
            boolean b=false;
            for(int j=0;j<n;j++)
            {
                if((i>=ranges[j][0])&&(i<=ranges[j][1]))
                {
                    b=true;
                    break;
                }
            }
            if(!b)
            return false;
        }
        return true;
    }
}