class Pair{
    int val;
    int freq;
    public Pair(int val,int freq){
        this.val=val;
        this.freq=freq;
    }
}
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        PriorityQueue<Pair> minh = new PriorityQueue<>((a, b) -> Integer.compare(a.freq, b.freq));

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i:map.keySet()){
            minh.offer(new Pair(i,map.get(i)));
        }
        // if(k<minh.peek().freq) return arr.length;
        while(k!=0 && !minh.isEmpty()){
            int freq=minh.peek().freq;
            if(freq>k)break;
            minh.poll();
            k=k-freq;
        }
        return minh.size();
    }
}