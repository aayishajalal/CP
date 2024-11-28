class Solution {
    public String oddString(String[] words) {
        Map<String,Integer> as=new LinkedHashMap<>();
         Map<String,String> as1=new LinkedHashMap<>(); 
        String a="",ans="",finalans="";
        for(String b:words){
            a="";
            for(int i=0;i<b.length()-1;i++){
                char ch=b.charAt(i),ch1=b.charAt(i+1);
                a+=ch1-ch;
                a+=" ";
            }
            as.put(a,as.getOrDefault(a,0)+1);
            as1.put(b,a);
        }
      //  System.out.println(as);
        for(Map.Entry<String,Integer> e: as.entrySet()){
            if(e.getValue()==1)
            ans=e.getKey();
        }
        for(Map.Entry<String,String> e: as1.entrySet()){
            if(e.getValue().equals(ans))
            finalans=e.getKey();
        }
       
    
        return finalans;
    }
}