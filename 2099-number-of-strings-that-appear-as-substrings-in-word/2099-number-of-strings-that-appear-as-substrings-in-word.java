class Solution 
{
    public int numOfStrings(String[] patterns, String word) 
    {
        int ans = 0;  
        HashSet <String> sub = new HashSet<>();

        for(int i=0 ;i<word.length();i++)
        {
            for(int j=i;j<word.length();j++)
            {
                sub.add(word.substring(i,j+1));
            }
        }  

        for(int i=0;i<patterns.length;i++)
        {
            if(sub.contains(patterns[i]))
            {
                ans++;
            }
        }
        return ans;
    }
}