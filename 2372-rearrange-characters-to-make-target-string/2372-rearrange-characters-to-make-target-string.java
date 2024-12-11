class Solution {
    public int rearrangeCharacters(String s, String target) {
        if(target.length() > s.length()){
            return 0;
        }

        int[] sarr = new int[256];
        int[] tarr = new int[256];

        for(int i = 0; i< s.length(); i++) {
            sarr[s.charAt(i)]++; // a:5
            if(i < target.length())
                tarr[target.charAt(i)]++;
        }

       // sarr = 2,4,2,2
        //tarr = 2,1,1,1

        int count = 100;
        for(int i = 0; i< target.length(); i++){
            char curChar = target.charAt(i);
            int occurrences = sarr[curChar]/tarr[curChar];
            if(occurrences < count){
                count = occurrences;
            }
        }
        return count;
    }
}