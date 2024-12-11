class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer>result=new HashSet<>();
        HashSet<Integer>hashset1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
           hashset1.add(nums1[i]);
        }
        HashSet<Integer>hashset2=new HashSet<>();
               for(int j=0;j<nums2.length;j++){
                hashset2.add(nums2[j]);
               }
            HashSet<Integer>hashset3=new HashSet<>();
            for(int k=0;k<nums3.length;k++){
                hashset3.add(nums3[k]); 
    }
       for(int num:hashset1){
        if(hashset2.contains(num)||hashset3.contains(num)){
            result.add(num);
       }
       }
       for(int num:hashset2){
        if(hashset3.contains(num)){
            result.add(num);
       }
       }
    return new ArrayList<>(result); 
    }
}