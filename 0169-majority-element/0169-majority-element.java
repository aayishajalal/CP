class Solution {
    public int majorityElement(int[] nums) {
      
      for(int i=0; i<nums.length; i++){
        int elem=nums[i];
        int count=0;
        for(int j=0; j<nums.length; j++){
            if(elem == nums[j]) count++;
        }
        if(count>nums.length/2) return elem;
      }
      return -1;
    }
}