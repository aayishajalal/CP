public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        Arrays.sort(nums);
        
        backtrack(nums, n, ans, set, 0);
        return ans;
    }
    
    private void backtrack(int[] nums, int n, List<List<Integer>> ans, List<Integer> set, int idx) {
        if (idx >= n) {
            ans.add(new ArrayList<>(set));
            return;
        }
        
        set.add(nums[idx]);
        backtrack(nums, n, ans, set, idx + 1);
        set.remove(set.size() - 1);
        
        while (idx + 1 < n && nums[idx] == nums[idx + 1]) {
            idx++;
        }
        backtrack(nums, n, ans, set, idx + 1);
    }
}