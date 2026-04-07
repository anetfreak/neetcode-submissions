class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         if(nums == null || nums.length <= 1) {
            return nums;
         }
         
         Map<Integer, Integer> counts = new HashMap<>();
        // Frequency
        for(int num: nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Min Heap
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        //Populate and keep heap = k
        for(Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            heap.add(new int[]{entry.getKey(), entry.getValue()});
            if(heap.size() > k){
                heap.poll(); // Remove smallest since we only need top k
            }
        }

        int[] result = new int[k];
        int i=0;
        while(!heap.isEmpty()) {
            result[i++] = heap.poll()[0];
        }

        return result;
    }
}
