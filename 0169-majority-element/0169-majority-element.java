class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxLen = 1, cur=1, maxElem=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                cur=0;
            }
            cur++;
            if(cur>maxLen){
                maxLen=cur;
                maxElem=nums[i];
            }
        }
        return maxElem;
    }
}