
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < heights.length; i++) {
            pq.offer(new int[] { heights[i], i });
        }

        String[] res = new String[names.length];
        int idx = 0;
        while (!pq.isEmpty()) {
            res[idx++] = names[pq.remove()[1]];
        }
        return res;
    }
}