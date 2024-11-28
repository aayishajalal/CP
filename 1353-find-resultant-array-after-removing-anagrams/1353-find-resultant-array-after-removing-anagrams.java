class Solution {
    public List<String> removeAnagrams(String[] words) {
        Stack<String> stack = new Stack<>();
        for(int i = words.length-1;i>= 0;i--){
            String s = words[i];
            while(!stack.isEmpty() && anagram(stack.peek(),s) == true)stack.pop();
            stack.push(s);
        }
        List<String> res = new ArrayList<>();
        while(!stack.isEmpty())res.add(stack.pop());
        return res;
    }
    
    public boolean anagram(String p,String q){
        int arr[] = new int[26];
        for(char i : p.toCharArray())arr[i-'a']+=1;
        for(char i : q.toCharArray())arr[i-'a']-=1;
        for(int i : arr)if(i != 0)return false;
        return true;
    }
}