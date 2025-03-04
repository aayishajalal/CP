class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: Empty array

        int index = 1; // Start from 1 since first element is always unique
        for (int i = 1; i < nums.length; i++) { 
            if (nums[i] != nums[i - 1]) { // Compare with previous element
                nums[index++] = nums[i]; // Store unique element at the next position
            }
        }
        return index; // Number of unique elements
    }
}
