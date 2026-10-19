class Pair{
    int num;
    int freq;
    public Pair(int num,int freq){
        this.num=num;
        this.freq=freq;
    }
}
class Solution {
    public int minSetSize(int[] arr) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Integer.compare(b.freq,a.freq));
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i:map.keySet()){
            pq.offer(new Pair(i,map.get(i)));
        }
        int n=arr.length;
        int target=arr.length/2;
        int min_count=0;
        while(!pq.isEmpty()){
            int freq=pq.poll().freq;
            n=n-freq;
            min_count++;
            if(n<=target){
                break;
            }
        }
        return min_count;
    }
}