class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int counter = 0;
        for(int i=0; i<nums.length; i++){
            if(counter == 0){
                candidate = nums[i];
                counter = 1;
            }
            else if(nums[i] != candidate){
                counter--;
            }
            else{
                counter++;
            }
        }
        return candidate;
    }
}