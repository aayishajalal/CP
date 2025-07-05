class Solution {
    public int[] productExceptSelf(int[] nums) {
        //using pre and post variables fill with 1 
        int pre =1, post =1;
        int res[] = new int[nums.length];
        //fill res[] with 1 
        Arrays.fill(res,1);
        //fill pre --> inside res 
        //run from 0 --> n
        for(int i=0; i<nums.length; i++){
            res[i]*=pre;
            pre*=nums[i];
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