class Solution {
    public int waysToSplitArray(int[] nums) {
        //running sum --- intializing to 0 and use long to handle overflow
        //rightSum = totalSum(arr) leftSum =0
        //on the go --> leftSum+=arr[i] rightSum=-arr[i] check cond --> valid++
        long leftSum=0, rightSum = 0; 
        int validSplit =0;
        for(int i:nums){
            rightSum+=i;
        }
        //dont compute for last element 
        for(int i=0; i<nums.length-1; i++){
            leftSum += nums[i];
            rightSum -=nums[i];
            if(leftSum>=rightSum) validSplit++;
        }
           return validSplit;
    }
 
}