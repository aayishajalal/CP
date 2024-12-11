class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> m=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                m.add(i);
            }
        }
        return m;
    }
}