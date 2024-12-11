class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int oddIndices[]=new int[n/2];
        int evenIndices[]=new int[(n+1)/2];
        int result[]=new  int[n];

        int i=0;
        int j=0;
        for(int k=0;k<n;k++){
            if(k%2==0){
                evenIndices[i++]=nums[k];
            }
            else{
                // k%2!=0
                oddIndices[j++]=nums[k];
            }
        }

        Arrays.sort(oddIndices);  // both are now sorted in non decreasing order(ascending)
        Arrays.sort(evenIndices);

        // now in resultant array we want elements at even in ascending order, so iterate over evenIndices from begining
        // and we want the elements at odd Indices in decending order so iterate over oddIndices from the end


        int p=0; // to track result
        int q=0; // to track evenIndices array
        int r=n/2-1; // to track oddIndices

         while (p < n) {
            if(q < evenIndices.length) {
                result[p++] = evenIndices[q++]; // Add elements from evenIndices
            }
            if(r>=0) {
                result[p++] = oddIndices[r--]; // Add elements from oddIndices in reverse order
            }
        }

        return result;
    }
}


// if possible use arrayList for storing odd and i=even indices element as it wont needed to define size and then all other steps same
//  Collections.sort(evenList);

        // Sort oddList in descending order
       // Collections.sort(oddList, Collections.reverseOrder());