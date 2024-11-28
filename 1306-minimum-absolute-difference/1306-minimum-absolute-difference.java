
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0;i<n-1;i++){
            min = Math.min(min, Math.abs(arr[i]-arr[i+1]));
        }
        
        for(int i=0;i<n-1;i++){

            List<Integer> sub = new ArrayList<>();

            if(Math.abs(arr[i]-arr[i+1]) == min){
                sub.add(arr[i]);
                sub.add(arr[i+1]);
                res.add(new ArrayList<>(sub));
            }
        }
        return res;
    }
}