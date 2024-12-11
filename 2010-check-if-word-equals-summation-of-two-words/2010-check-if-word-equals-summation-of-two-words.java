class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int num1 = sum(firstWord);
        int num2 = sum(secondWord);
        int num3 = sum(targetWord);

        int sumation = num1+num2;

        if(sumation == num3){
            return true;
        }
        return false;

         }

public int sum(String eleme){

      String database = "abcdefghij";

        ArrayList<Integer>numbers = new ArrayList();
         
         for(int i=0;i<eleme.length();i++){
char cd = eleme.charAt(i);
int num =0;
for(int j=0;j<database.length();j++){
    if(database.charAt(j)== cd){
        num =j;
    }
}

numbers.add(num);
         }
int result =0;
      for(int i=0;i<numbers.size();i++){
           result *= 10;
            result += numbers.get(i);
      }

        return result;
}
        
    }