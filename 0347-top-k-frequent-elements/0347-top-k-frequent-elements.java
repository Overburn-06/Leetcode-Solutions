class Pair{
    int key;
    int value;
    public Pair(int key,int value){
        this.key=key;
        this.value=value;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int []res=new int[k];
        PriorityQueue<Pair> maxh = new PriorityQueue<>((a, b) -> (b.value - a.value));
        for(int i:map.keySet()){
           maxh.offer(new Pair(i,map.get(i)));
        }
        int j=0;
        while(k!=0){
            res[j++]=maxh.poll().key;
            k--;
        }
        return res;
    }
}