class Solution {
    public int heightChecker(int[] heights) {
    int number = 0;
    int[] clone = new int[heights.length];
    for(int i=0;i<heights.length;i++)
    {
        clone[i]=heights[i];
    }
    Arrays.sort(clone);
    for(int i=0;i<heights.length;i++)
    {
        if(heights[i]!=clone[i])
            number++;
    }
    return number;
    }
}