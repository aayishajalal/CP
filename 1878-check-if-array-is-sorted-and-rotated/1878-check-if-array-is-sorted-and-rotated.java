class Solution {
    public boolean check(int[] nums) {
        //with circular checks 
        int violations =0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            //curr<prev
            /*circular checks
            compares 0 and n-1  --> 1 and 0 ---so on 
                nums[0]
            */
            if(nums[i] < nums[(i-1+n)%n]) violations+=1;
            if(violations>1)return false;
        }
        return true;
    }
}