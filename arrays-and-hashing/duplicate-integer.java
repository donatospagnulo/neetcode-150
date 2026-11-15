/*
    Duplicate-integer
    https://neetcode.io/problems/duplicate-integer/

    Idea: Comparing each number with every number after it.
    Time: O(n^2) Worst case, O(1) best case, nested loops.
    Space: O(1), just two simple variables assignment.

*/

class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}