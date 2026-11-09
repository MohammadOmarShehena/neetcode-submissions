class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int counter = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            int element = sum - k;
            if(map.containsKey(element)){
                counter+= map.get(element);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return counter;
    }
}