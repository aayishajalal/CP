class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int GCD = 1;
        for(int i = 1; i <= nums[0]; i++) {
            if(nums[0] % i == 0 && nums[nums.length - 1] % i == 0) {
                GCD = i;
            }
        }
        return GCD;
    }
}