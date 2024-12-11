class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num < 10) {
            return true; // Single-digit numbers are always the same after any number of reversals.
        }
        String test = String.valueOf(num); // Convert the number to a string to easily check the last character.
        return test.charAt(test.length() - 1) != '0'; // Check if the last digit is '0'. If it is, return false.
    }
}