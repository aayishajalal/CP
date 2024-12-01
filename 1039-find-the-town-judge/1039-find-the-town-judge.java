class Solution {
    public int findJudge(int n, int[][] trust) {
         int sum = n*(n+1)/2;
        int count = 1;
        if(n <1)
        return -1;
        if(n ==1 && (trust == null || trust.length == 0 || trust[0].length == 0) )
         return n;


         HashSet<Integer>myUniqyeP = new HashSet<>();
        HashMap<Integer,Integer>trustCount = new HashMap<>();
        for (int i = 0; i < trust.length; i++) {
            int person = trust[i][0];
            int pJ =trust[i][1];
            if(!trustCount.containsKey(pJ))
            trustCount.put(pJ,count);
            else
                trustCount.put(pJ,trustCount.get(pJ) + 1);
            myUniqyeP.add(person);
        }
        Iterator<Integer> iterator = myUniqyeP.iterator();
        while (iterator.hasNext()) {
           int person = iterator.next();
          sum = sum - person;
        }
        if(sum == 0)
           return -1;
        else
        {
            if(sum != findMostFrequentPossiblty(trustCount))
            {
                return  -1;
            }
            else
                return sum;
        }
}
public static int findMostFrequentPossiblty(HashMap<Integer,Integer>map)
    {
        int mostFrequentP = 0;
        int maxFrequency = 0;
        if(map.size()>1)
        {
            int  firstValue = map.values().iterator().next();
            boolean allValuesEqual = map.values().stream().allMatch(value -> value.equals(firstValue));
            if(allValuesEqual)
                return  -1;
            else
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > maxFrequency) {
                        mostFrequentP = entry.getKey();
                        maxFrequency = entry.getValue();
                    }else if(entry.getValue() == maxFrequency)
                    {

                    }
                }
        }else if(map.size() == 1)
        {
            return map.keySet().iterator().next();
        }else
        {
            return  -1;
        }

        return mostFrequentP;

    }
}