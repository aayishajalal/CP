class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int curr=releaseTimes[0];
        char ans=keysPressed.charAt(0);
        for(int i=1;i<releaseTimes.length;i++){
            if(releaseTimes[i]-releaseTimes[i-1]>curr){
                curr=releaseTimes[i]-releaseTimes[i-1];
                ans=keysPressed.charAt(i);
            }else if(releaseTimes[i]-releaseTimes[i-1]==curr){
                ans=(ans>=keysPressed.charAt(i))?ans:keysPressed.charAt(i);
            }
        }
        return ans;
    }
}