class Solution {
    public int missingNumber(int[] nums) {
        int number=nums.length;
        for(int i=0;i<nums.length;i++){
            number=number^i^nums[i];
        }
        return number;
    }
}