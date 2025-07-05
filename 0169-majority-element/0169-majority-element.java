class Solution {
    public int majorityElement(int[] nums) {
      int count = 0, elem = nums[0];
      //1. Apply Moore's Voting Algorithm 
      for(int i=0; i<nums.length; i++){
        if(count==0){
            elem=nums[i];
        }
        if(nums[i]==elem){
            count++;
        }else{
            count--;
        }
      }
      return elem;
    //   //2. Verify the element appears more than n/2 times
    //   int count1 = 0;
    //   for(int i=0; i<nums.length; i++ ){
    //     if(nums[i] == elem) count1++;
    //   }
    //   if(count1>nums.length/2) return elem;
    //   return -1;
    }
}