class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == key) { 
                for (j = Math.max(i - k, j); j <= Math.min(nums.length - 1, i + k); j++) {
                    ans.add(j);
                }
            }
        }
        return ans;
    }
}