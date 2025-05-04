class Solution {
    public int missingNumber(int[] nums) {
        // int maxNum = nums[0];
        // int minNum = nums[0];
        // for(int i=1 ; i<nums.length; i++ ){
        //     if(maxNum<nums[i]){
        //         maxNum = nums[i];
        //     }
        //     if(minNum>nums[i]){
        //         minNum = nums[i];
        //     }
        // }
        Arrays.sort(nums);
        int val = 0;
            for(int num:nums){
                if(num!=val && val<nums.length){
                    return val;
                }
                val++;
        } 
        return nums.length; 
    }
}