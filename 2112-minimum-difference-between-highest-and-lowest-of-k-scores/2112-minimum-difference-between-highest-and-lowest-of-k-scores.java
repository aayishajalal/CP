class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-k+1;i++){
            int j=i+k-1;
            int temp=nums[j]-nums[i];
            min=Math.min(min,temp);
        }
        return min;
    }
}