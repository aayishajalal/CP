class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = Integer.MIN_VALUE;
        int maxElem = nums[0];
        for (int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>maxCount ){
                maxCount = map.get(key);
                maxElem = key;
            }
        }
        return maxElem;
    }
}