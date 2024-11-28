class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0, j = 1, n = nums.length;

        while (i < n && j < n) {
            
            while (i < n && (nums[i] & 1) == 0) {
                i += 2;
            }
            while (j < n && (nums[j] & 1) == 1) {
                j += 2;
            }
             if (i < n && j < n) {
                swap(i, j,nums);
            }
        }
        return nums;
    }

    void swap(int i, int j, int[] nums) {
        if (nums[i] != nums[j]) {  
            nums[i] = nums[i] ^ nums[j]; 
            nums[j] = nums[i] ^ nums[j]; 
            nums[i] = nums[i] ^ nums[j];  
        }
    }
}