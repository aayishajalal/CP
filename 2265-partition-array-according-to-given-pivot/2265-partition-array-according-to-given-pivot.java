class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[] = new int[nums.length];
        int lesserIndex = 0, greaterIndex = nums.length -1;
        for(int i = 0, j=nums.length-1; i<nums.length; i++,j--){
            if(nums[i]<pivot) ans[lesserIndex++] = nums[i];
            if(nums[j]>pivot) ans[greaterIndex--]=nums[j];
        }
        while(lesserIndex<=greaterIndex){
            ans[lesserIndex++] = pivot;
        }
        return ans;
    }
}