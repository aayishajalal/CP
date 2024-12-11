class Solution {
    public int reverse(int x) {
        int y=Math.abs(x);
        int rev=0;
        while(y>0){
            int rem=y%10;
              // Check for overflow before updating rev
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;  // Return 0 for overflow
            }
            rev=rev*10+rem;
            y=y/10;
        }
        if(x<0){
            return (-1* rev);
        }    
        return rev;
        }
}