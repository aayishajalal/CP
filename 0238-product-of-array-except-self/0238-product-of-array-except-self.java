class Solution {
    public int[] productExceptSelf(int[] nums) {
        //using pre and post variables fill with 1 
        int post =1;
        int res[] = new int[nums.length];
        //fill pre --> inside res 
        //run from 0 --> n
        res[0]=1;
        for(int i=1; i<nums.length; i++){
            res[i] = res[i - 1] * nums[i - 1];
        }
        //fill post --> inside res 
        //run in n-1 --> 0
        for(int i=nums.length-1; i>=0; i--){
            res[i]*=post;
            post*=nums[i];
        }

        return res;
    }
}