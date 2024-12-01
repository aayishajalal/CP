class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0, temp = 0, count = 0;
        for (int i = 0; i < arr.length; i++)    sum += arr[i];
        if (sum % 3 != 0)    return false;
        int part = sum / 3;
        for (int a : arr) {
            temp += a;
            if (temp == part) {
                temp = 0;
                count++;
            }
        }
        return count >= 3;
    }
}