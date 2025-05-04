class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int count=0, curCount=0;
       for(int i=0; i<nums.length;i++){
        if(nums[i]==1){
            curCount+=1;
        }else{
            curCount=0;
        }
        count=Math.max(curCount,count);
        
       } 
       return count;
    }
}