class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int j = i+1;
            while(j<n){
                if(Math.abs(nums[i]-nums[j]) == k){
                    count++;
                }
                j++;
            }
        }
        return count;
    }
}