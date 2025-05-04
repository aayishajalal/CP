class Solution {
    public int numEquivDominoPairs(int[][] dom) {
        int  count=0;
        HashMap<String,Integer>map=new HashMap<>();
        int i=0;
        int n=dom.length;
        while(i<n){
            String temp="";
            if(dom[i][0]>dom[i][1]){
                temp+=dom[i][1];
                temp+=dom[i][0];
            }else{
                temp+=dom[i][0];
                temp+=dom[i][1];
            }
            if(map.containsKey(temp))count+=map.get(temp);
            map.put(temp,map.getOrDefault(temp,0)+1);
            i++;
        }
        return count;
    }
}