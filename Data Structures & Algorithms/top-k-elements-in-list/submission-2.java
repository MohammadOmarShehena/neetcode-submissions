class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //MINHEAP // PRIORITY QUEUE 
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int[] ans = new int[k];

        Queue<Integer> minHeap = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for(int key : map.keySet()){
            minHeap.add(key);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        while(k-- > 0){
            ans[k] = minHeap.poll();   
        }
        return ans;

    }
}
