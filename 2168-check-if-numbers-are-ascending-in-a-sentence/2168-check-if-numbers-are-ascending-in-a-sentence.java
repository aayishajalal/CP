class Solution {
    public boolean areNumbersAscending(String s) {
        List<Integer> ls= new ArrayList<>();

        // get the every Integer to the list ls
        String[] t=s.split(" ");
        for(String word: t){

            try{
                int num= Integer.parseInt(word);
                ls.add(num);
            }
            catch(NumberFormatException e){

            }

        }

        for(int i=0;i<ls.size()-1;i++){
            if(ls.get(i)>=ls.get(i+1)) return false;
        }
        return true;
    }
}