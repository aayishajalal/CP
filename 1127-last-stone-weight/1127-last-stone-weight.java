class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>set = new PriorityQueue<>((a,b)->b-a);
        for(int i:stones)set.offer(i);

        while(set.size()>1){
            int x = set.poll();
            int y = set.poll();
            if(x != y)set.offer(x-y);
        }
    return set.isEmpty()?0:set.poll();
    }
}