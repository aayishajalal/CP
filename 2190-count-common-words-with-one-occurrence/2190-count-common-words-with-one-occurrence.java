class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> mapWords1 = new HashMap<>();

        for(String s : words1){
            mapWords1.put(s, mapWords1.getOrDefault(s, 0) + 1);
        }

        Map<String, Integer> mapWords2 = new HashMap<>();

          for(String s : words2){
            mapWords2.put(s, mapWords2.getOrDefault(s, 0) + 1);
        }
System.out.println(mapWords1);
System.out.println(mapWords2);
        int ans = 0;
        List<String> list = new ArrayList<>();

        for(Map.Entry<String, Integer> map : mapWords1.entrySet()){
            if(map.getValue() == 1){
                    list.add(map.getKey());
            }
        }
System.out.println(list);
        for(Map.Entry<String, Integer> map : mapWords2.entrySet()){
            if(map.getValue() == 1 && list.contains(map.getKey())){
                ans++;
            }
        }
return ans;
    }
}