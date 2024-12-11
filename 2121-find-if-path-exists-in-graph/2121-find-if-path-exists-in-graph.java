class Solution {
    static int par[];
    static int size[];
    static int rank[];   // to find the number of linkage to that parent
    // here the T.C of find will be O(logn)
    // same goes for the union

    // here we can do one more optimization which is called path compresion
    // in which we set the child to its parent while returning from the base case of find operation

    // now using this optimization we have reduce the T.C from O(logn) to O(log*n)
    // here log*n means that minimum how many operation is needed to convert n to less than 1 w.r.t base 2;
    // for example log*2^32 is approx 5;

    static int find(int a){
        if(par[a]==a) return a;
        else return par[a] = find(par[a]);
    }

    static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a==b)  return; // Both a and b are in the same set
        if(rank[a]>= rank[b]){
            par[b] = a;
            rank[a]++;

        }else{
            par[a] = b;
            rank[b]++;
        }
    }

    public boolean validPath(int n, int[][] edges, int s, int d) {
        par = new int[n];
        rank = new int[n];

        for(int i=0; i<n; i++){
            par[i] = i;
        }
        for(var a : edges){
            int x = find(a[0]);
            int y = find(a[1]);
            if(x!=y){
                union(x,y);
            }
        }

        if(find(s)==find(d)) return true;
        else return false;
    }
}