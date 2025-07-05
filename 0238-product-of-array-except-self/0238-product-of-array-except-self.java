class Solution {
    public int[] productExceptSelf(int[] nums) {
        //using pre and post arrays 
        int n= nums.length;
        int res[] = new int[n];
        int pre[]  = new int[n];
        int post[] = new int[n];
        Arrays.fill(pre,1);
        Arrays.fill(post,1);
        Arrays.fill(res,1);
        //pre array computation
        pre[0] = 1;
        for(int i=1; i<n; i++){
            pre[i] = pre[i-1]*nums[i-1];
        }
        //post array computation
        for(int i=n-2; i>=0; i--){
            post[i]=post[i+1]*nums[i+1];
        }

        //res array computation --> pre[i]*post[i]
        for(int i=0; i<n; i++){
            res[i]=pre[i]*post[i];
        }
        return res;
    }
}