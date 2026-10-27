class Pair{
    int diff;
    int profit;
    public Pair(int diff,int profit){
        this.diff=diff;
        this.profit=profit;
    }
}
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Integer.compare(a.diff,b.diff));
        for(int i=0;i<difficulty.length;i++){
            pq.offer(new Pair(difficulty[i],profit[i]));
        }
        Arrays.sort(worker);
        int sum=0;
        int i=0;
        int diff=0;
        int prof=0;
        while(i<worker.length){
            while(!pq.isEmpty() && pq.peek().diff<=worker[i]){
                diff=pq.peek().diff;
                prof=Math.max(pq.peek().profit,prof);
                pq.poll();
            }
            i++;
            sum+=prof;
        }
        return sum;
    }
}