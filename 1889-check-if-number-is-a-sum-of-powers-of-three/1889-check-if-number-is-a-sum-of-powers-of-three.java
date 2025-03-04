class Solution {
    public boolean checkPowersOfThree(int n) {
        //similar to 2 (mod --> 0,1 ) then (div --> to move next bit)
        while(n>0){

            //same power - twice [eg: 21 = 3^2+3^2+3^1 == 9+9+3]
            if(n%3==2) return false;
            n/=3;
        }
        return true;
    }
}