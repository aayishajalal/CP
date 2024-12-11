class Solution {
    public int minimumCost(int[] cost) {
       Arrays.sort(cost);
       int took=0;
       int sum=0;
       for(int i=cost.length-1;i>=0;i--){
            if(sum==2){
                sum=0;
            }else{ 
                took+=cost[i];
                sum++;
            }
       } 
       return took;
    }
}