class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[]arr=new int[26];
        int seq=0;
        for(char c:order.toCharArray()){
            arr[c-'a']=seq++;
        }
        for(int i=0;i<words.length-1;i++){
            String cur=words[i];
            String next=words[i+1];
            int len=Math.min(cur.length(),next.length());
            if(len!=cur.length() && cur.startsWith(next)){
                return false;
            }
            for(int l=0;l<len;l++){
                if(arr[cur.charAt(l)-'a']>arr[next.charAt(l)-'a']){
                    return false;
                }
                if(arr[cur.charAt(l)-'a']<arr[next.charAt(l)-'a']){
                    break;
                }
            }
        }
        return true;
    }
}