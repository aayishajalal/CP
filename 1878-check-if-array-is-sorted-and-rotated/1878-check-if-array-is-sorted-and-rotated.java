class Solution {
    public boolean check(int[] nums) {
        int count = 0; // Count of "violations" in the array
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            // Check for violations in the sorted order
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }

        // Handle the circular condition by comparing the last and first elements
        if (nums[n - 1] > nums[0]) {
            count++;
        }

        // Valid only if at most one violation exists
        return count <= 1;
    }
}
