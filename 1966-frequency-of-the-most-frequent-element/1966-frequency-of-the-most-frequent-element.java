class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left =0, maxFreq = 1;
        long totalOperations = 0;

        for(int right=0; right<nums.length; right++){
            if(right>0){
                totalOperations+=(long)(nums[right]-nums[right-1])*(right-left);
            }
            while(totalOperations>k){
                totalOperations-=(nums[right]-nums[left]);
                left++;
            }
        maxFreq=Math.max(maxFreq,(right-left+1));
        }
        return maxFreq;
    }

}