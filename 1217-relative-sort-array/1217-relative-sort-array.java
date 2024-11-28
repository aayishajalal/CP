class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        ArrayList<Integer> li=new ArrayList<>();
        ArrayList<Integer> li2=new ArrayList<>();

        for(int n:arr1){
            if(!mp.containsKey(n)){
                mp.put(n,1);
            }
            else mp.put(n,mp.get(n)+1);
        }

        for(int n:arr2){
            if(mp.containsKey(n)){
                for(int i=0;i<mp.get(n);i++)
                li.add(n);
            }
            mp.remove(n);
        }

        if(!mp.isEmpty()){
            for(int n:mp.keySet()){
                for(int i=0;i<mp.get(n);i++){
                   li2.add(n); 
                }
            }
        }
        Collections.sort(li2);
        for(int i=0;i<li2.size();i++){
            li.add(li2.get(i));
        }
        for(int i=0;i<li.size();i++)
        arr1[i]=li.get(i);

        return arr1;
    }
}