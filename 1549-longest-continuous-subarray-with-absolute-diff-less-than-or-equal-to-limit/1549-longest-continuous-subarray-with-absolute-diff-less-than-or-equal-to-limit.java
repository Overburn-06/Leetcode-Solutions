class Pair{
    int value;
    int index;
    Pair(int value,int index){
        this.value=value;
        this.index=index;
    }
}
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int left=0;
        int res=0;
        PriorityQueue<Pair>max_heap=new PriorityQueue<>((a,b)->Integer.compare(b.value,a.value));
        PriorityQueue<Pair>min_heap=new PriorityQueue<>((a,b)->Integer.compare(a.value,b.value));
        for(int right=0;right<nums.length;right++){
            max_heap.offer(new Pair(nums[right],right));
            min_heap.offer(new Pair(nums[right],right));
            while((!min_heap.isEmpty()&&!max_heap.isEmpty()) && Math.abs(max_heap.peek().value-min_heap.peek().value)>limit){
                left=Math.min(min_heap.peek().index,max_heap.peek().index)+1;
                while(!min_heap.isEmpty() && min_heap.peek().index<left){
                    min_heap.poll();
                }
                while(!max_heap.isEmpty() && max_heap.peek().index<left){
                    max_heap.poll();
                }
            }
            res=Math.max(res,right-left+1);
        }
        return res;
    }
}