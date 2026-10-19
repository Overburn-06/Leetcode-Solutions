class Pair{
    int num;
    int freq;
    public Pair(int num,int freq){
        this.num=num;
        this.freq=freq;
    }
}
class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        if(barcodes.length==1)return barcodes;
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Integer.compare(b.freq,a.freq));
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<barcodes.length;i++){
            map.put(barcodes[i],map.getOrDefault(barcodes[i],0)+1);
        }
        for(int i:map.keySet()){
            pq.offer(new Pair(i,map.get(i)));
        }
        int []res=new int[barcodes.length];
        int i=0;
        while(!pq.isEmpty()){
            Pair first=pq.poll();
            if(i==0){
                res[i++]=first.num;
                first.freq--;
            }
            else if(i>0 && res[i-1]!=first.num){
                res[i++]=first.num;
                first.freq--;
            }
            if(!pq.isEmpty()){
                Pair second=pq.poll();
                res[i++]=second.num;
                second.freq--;
                if(second.freq!=0){
                    pq.offer(second);
                }
            }
            if(first.freq!=0){
                pq.offer(first);
            }
        }
        return res;
    }
}