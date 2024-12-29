class Solution {
    public boolean check(int[] nums) {
        int violations =0;
        //atmost 1 violation is allowed for rotated sorted array
        for(int i=0; i<nums.length-1; i++){
            //prev>next -- violations+=1
            if(nums[i]>nums[i+1]) violations+=1;
     
        }
               /*compare in circular manner - as rotated sorted array
            last>first 
            prev>next  --> violations+=1
            */
            if(nums[nums.length-1]>nums[0]) violations+=1;
        //if violations is <=1 return true
        return violations<=1;
    }
}