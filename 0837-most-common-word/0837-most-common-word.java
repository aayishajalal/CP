class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
    String symbols="!?',;.";

    HashMap<String,Integer>mp=new HashMap<>();
    HashMap<String,Boolean>ban=new HashMap<>();

    String maxi=null;
    int num=0;

    for(int i=0;i<symbols.length();i++){
        char temp=symbols.charAt(i);
        paragraph=paragraph.replace(temp,' ');
    }

    String[]arr=paragraph.split(" ");

    for(int i=0;i<banned.length;i++){

    ban.put(banned[i],true);

    }

    for(int i=0;i<arr.length;i++){

    arr[i]=arr[i].replace(" ","");

    arr[i]=arr[i].toLowerCase();

    if(!ban.containsKey(arr[i])&&arr[i]!=""){
        
    if(!mp.containsKey(arr[i]))mp.put(arr[i],1);
    else mp.put(arr[i],mp.get(arr[i])+1);

    if(mp.get(arr[i])>num){

    maxi=arr[i];

    num=mp.get(arr[i]);

    }

    }


    }

    return maxi;

    }
}