class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i, 0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(Integer.compare(a[1],b[1])));
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            pq.offer(new int[]{e.getKey(), e.getValue()});      
        }

        while(pq.size()>k){
            pq.poll();
        }
        int[] res = new int[k];
        for(int i =0; i<res.length; i++){
            int[] arr = pq.poll();
            res[i] = arr[0];
        }

        return res;



    }
}
