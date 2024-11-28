class Solution{
    public boolean checkDistances(String s, int[] distance){
        int[] ar1 = new int[26];
        Arrays.fill(ar1, -1);
        int[] ar2 = new int[26];
        Arrays.fill(ar2, -1);
        for(int i=0; i<s.length(); i++){
            if(ar1[s.charAt(i)-'a']!=-1) ar2[s.charAt(i)-'a'] = i;
            else ar1[s.charAt(i)-'a'] = i;
        }
        for(int i=0; i<26; i++){
            if(ar1[i]!=-1 && ar2[i]-ar1[i]-1!=distance[i]) return false;
        }
        return true;
        
    }
}