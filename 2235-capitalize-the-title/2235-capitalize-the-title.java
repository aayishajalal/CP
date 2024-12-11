class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb=new StringBuilder();
        String[]arr=title.split(" +");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()<3){
               sb.append(arr[i].substring(0).toLowerCase());
               sb.append(" ");
            }
            else{
                sb.append(arr[i].substring(0,1).toUpperCase());
                sb.append(arr[i].substring(1).toLowerCase());
                sb.append(" ");
            }
        }
        return sb.toString().trim();
        
    }
}