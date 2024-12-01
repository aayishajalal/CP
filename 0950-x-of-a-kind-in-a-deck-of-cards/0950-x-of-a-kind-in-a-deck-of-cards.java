class Solution {

    static int hcf(int x, int y){
        if(y==0) return x;
        return hcf(y,x%y);
    }
    public boolean hasGroupsSizeX(int[] arr) {
        HashMap<Integer,Integer> hp = new HashMap<>();

        int n = arr.length;
        if(n==1) return false;
        for(int i=0; i<n; i++){
            hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
        }

        int x = hp.get(arr[0]);

        for(var a : hp.values()){
            x = hcf(x,a);
        }

        if(x==1) return false;
        else return true;

    }
}