class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n1=derived.length;
        int[] org=new int[n1];

        //Populating the org array
        for(int i=1; i<n1; i++){
            org[i]=derived[i-1]^org[i-1];
        }

        //Validating the rules for index i
        for(int i=0; i<n1; i++){
            int idx=(i+1)%n1;
            if(derived[i]!=(org[i]^org[idx])) return false;
        }

        return true;
    }
}